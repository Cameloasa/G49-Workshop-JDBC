package se.lexicon.daoimpl;

import se.lexicon.dao.CityDao;
import se.lexicon.db.MySQLConnection;
import se.lexicon.model.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CityDaoJDBC implements CityDao {

    private Connection connection;

    private City extractCityFromResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("ID");
        String name = rs.getString("Name");
        String countryCode = rs.getString("CountryCode");
        String district = rs.getString("District");
        int population = rs.getInt("Population");
        return new City(id, name, countryCode, district, population);
    }

    public CityDaoJDBC() {
        this.connection = MySQLConnection.getConnection();
    }



    @Override
    public City findById(int id) {
        String query = "SELECT * FROM City WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return extractCityFromResultSet(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<City> findByCode(String code) {
        List<City> cities = new ArrayList<>();
        String query = "SELECT * FROM City WHERE CountryCode = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, code);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cities.add(extractCityFromResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }

    @Override
    public List<City> findByName(String name) {
        List<City> cities = new ArrayList<>();
        String query = "SELECT * FROM City WHERE Name = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cities.add(extractCityFromResultSet(rs));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }

    @Override
    public List<City> findAll() {
        List<City> cities = new ArrayList<>();
        String query = "SELECT * FROM City";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                cities.add(extractCityFromResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }

    @Override
    public City add(City city) {
        String query = "INSERT INTO City (Name, CountryCode, District, Population) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, city.getCityName());
            stmt.setString(2, city.getCityCode());
            stmt.setString(3, city.getCityDistrict());
            stmt.setInt(4, city.getCityPopulation());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }return null;

    }

    @Override
    public City update(City city) {
        String query = "UPDATE City SET Name = ?, CountryCode = ?, District = ?, Population = ? WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, city.getCityName());
            stmt.setString(2, city.getCityCode());
            stmt.setString(3, city.getCityDistrict());
            stmt.setInt(4, city.getCityPopulation());
            stmt.setInt(5, city.getCityId());
            int affectedRows = stmt.executeUpdate();
            if (affectedRows == 1) {
                return city;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int delete(City city) {
        String query = "DELETE FROM City WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, city.getCityId());
            return stmt.executeUpdate();

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
