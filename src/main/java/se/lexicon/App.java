package se.lexicon;


import se.lexicon.daoimpl.CityDaoJDBC;
import se.lexicon.model.City;

import java.util.List;

public class App
{
    public static void main( String[] args ) {

        // Instantiate CityDaoJDBC
        CityDaoJDBC cityDao = new CityDaoJDBC();

        // Find city by ID
        City cityById = cityDao.findById(1);
        System.out.println("City found by ID: " + cityById);

        // Find cities by code
        List<City> citiesByCode = cityDao.findByCode("ABC");
        System.out.println("Cities found by code: " + citiesByCode);

        // Find cities by name
        List<City> citiesByName = cityDao.findByName("New York");
        System.out.println("Cities found by name: " + citiesByName);

        // Find all cities
        List<City> allCities = cityDao.findAll();
        System.out.println("All cities: " + allCities);

        // Add city
        City newCity = new City(100, "Stockholm", "SWE", "Stockholms län", 959215); // Create a new city
        City addedCity = cityDao.add(newCity); // Add the city to the database
        System.out.println("Added city: " + addedCity);

        // Update city
        City updatedCity = new City(100, "Stockholm", "SWE", "Stockholms län", 1000000); // Update the city
        cityDao.update(updatedCity); // Update the city in the database
        System.out.println("Updated city: " + updatedCity);

        // Delete city
        City cityToDelete = new City();
        cityToDelete.setCityId(3);
        int deletedRows = cityDao.delete(cityToDelete);
        System.out.println("Deleted rows: " + deletedRows);
    }
}
