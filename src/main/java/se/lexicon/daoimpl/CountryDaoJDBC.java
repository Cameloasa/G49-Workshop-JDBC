package se.lexicon.daoimpl;

import se.lexicon.dao.CountryDao;
import se.lexicon.model.Country;

import java.sql.Connection;
import java.util.List;

public class CountryDaoJDBC implements CountryDao {

    private Connection connection;



    @Override
    public Country findById(String code) {
        return null;
    }

    @Override
    public List<Country> findAll() {
        return List.of();
    }

    @Override
    public Country add(Country country) {
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
