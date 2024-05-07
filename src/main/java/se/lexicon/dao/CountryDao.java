package se.lexicon.dao;

import se.lexicon.model.Country;

import java.util.List;

public interface CountryDao {
    Country findByCode(String code);
    List<Country> findAll();
    Country add(Country country);
    Country update(Country country);
    boolean delete(Country country);
}
