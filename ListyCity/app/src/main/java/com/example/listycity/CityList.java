package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a city exists in the list
     * @param city
     * This is a candidate city to check
     * @return
     * Return true if the city exists in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * This deletes a city from the list. If the city exists in the list then it will be deleted, otherwise, an exception will be thrown.
     * @param city
     * This is a candidate city to delete provided by the user.
     */

    public void delete(City city) {

        if (this.hasCity(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }

    }

    /**
     * This counts the number of cities in the list
     *
     * @return
     * Returns an integer that represents the number of cities in the list.
     */

    public int countCities() {
        return cities.size();
    }

}
