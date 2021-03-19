package com.example.simpleparadox.listycity;

import android.util.Log;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void compareToSame() {
        City oneCity = mockCity();
        City anotherCity = mockCity();
        assertTrue(oneCity.sameProvince(anotherCity));
    }

    @Test
    void compareToDifferent() {
        City oneCity = mockCity();
        City anotherCity = new City("Toronto", "Ontario");
        assertFalse(oneCity.sameProvince(anotherCity));
    }
}