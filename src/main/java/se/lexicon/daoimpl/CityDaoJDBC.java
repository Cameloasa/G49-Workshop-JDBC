package se.lexicon.daoimpl;

import se.lexicon.dao.CityDao;
import se.lexicon.db.MySQLConnection;
import se.lexicon.model.City;

import java.sql.Connection;
import java.util.List;

public class CityDaoJDBC implements CityDao {

    private Connection connection;



    public CityDaoJDBC() {
        this.connection = MySQLConnection.getConnection();
    }



    @Override
    public City findById(int id) {
        return null;
    }

    @Override
    public List<City> findByCode(String code) {
        return List.of();
    }

    @Override
    public List<City> findByName(String name) {
        return List.of();
    }

    @Override
    public List<City> findAll() {
        return List.of();
    }

    @Override
    public City add(City city) {
        return null;
    }

    @Override
    public City update(City city) {
        return null;
    }

    @Override
    public int delete(City city) {
        return 0;
    }
}
