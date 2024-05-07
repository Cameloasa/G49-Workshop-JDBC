package se.lexicon.daoimpl;

import se.lexicon.dao.CountryDao;
import se.lexicon.db.MySQLConnection;
import se.lexicon.model.Continent;
import se.lexicon.model.Country;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountryDaoJDBC implements CountryDao {

    private Connection connection;

    private Country extractCountryFromResultSet(ResultSet rs) throws SQLException {
        //Extract data from result set and create a Country object
        Country country = new Country();
        country.setCode(rs.getString("Code"));
        country.setCountryName(rs.getString("Name"));
        country.setPopulation(rs.getInt("Population"));
        country.setContinent(Continent.valueOf(rs.getString("Continent")));
        country.setRegion(rs.getString("Region"));
        country.setSurfaceArea(rs.getFloat("SurfaceArea"));
        country.setIndepYear(rs.getInt("IndepYear"));
        country.setLifeExpectancy(rs.getFloat("LifeExpectancy"));
        country.setGnp(rs.getFloat("GNP"));
        country.setGnpOld(rs.getFloat("GNPOld"));
        country.setLocalName(rs.getString("LocalName"));
        country.setGovernmentForm(rs.getString("GovernmentForm"));
        country.setHeadOfState(rs.getString("Head of State"));
        country.setCapital(rs.getInt("Capital"));
        country.setCode2(rs.getString("Code2"));
        return country;

    }

    public CountryDaoJDBC() {
        this.connection = MySQLConnection.getConnection();
    }



    @Override
    public Country findByCode(String code) {
        String query = "SELECT * FROM Country WHERE Code = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, code);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return extractCountryFromResultSet(rs);
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Country> findAll() {
        List<Country> countries = new ArrayList<>();
        String query = "SELECT * FROM Country";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                countries.add(extractCountryFromResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return countries;
    }

    @Override
    public Country add(Country country) {
        String query = "INSERT INTO Country VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1, country.getCode());
            stmt.setString(2, country.getCountryName());
            stmt.setInt(3, country.getPopulation());
            stmt.setString(4, country.getContinent().toString());
            stmt.setString(5, country.getRegion());
            stmt.setFloat(6, country.getSurfaceArea());
            stmt.setInt(7, country.getIndepYear());
            stmt.setFloat(8, country.getLifeExpectancy());
            stmt.setFloat(9, country.getGnp());
            stmt.setFloat(10, country.getGnpOld());
            stmt.setString(11, country.getLocalName());
            stmt.setString(12, country.getGovernmentForm());
            stmt.setString(13, country.getHeadOfState());
            stmt.setInt(14, country.getCapital());
            stmt.setString(15, country.getCode2());

            int affectedRows = stmt.executeUpdate();
            ResultSet generatedKeys = null;
            if (affectedRows == 1) {
                generatedKeys = stmt.getGeneratedKeys();
            }
            if (generatedKeys.next()) {
                String code = generatedKeys.getString(1);
                country.setCode("");
                return country;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Country update(Country country) {
        return null;
    }

    @Override
    public boolean delete(Country country) {
        return false;
    }
}
