package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertEquals;

public class TestGetFreePlaces {
    @Before
    public void setUp(){
        Storage.addObject("Product1", 1);
        Storage.addObject("Product2", 2);
    }
    @Test
    public void testPositive() {
        assertEquals(1, Storage.getFreePlaces());
    }

    @Test
    public void testNegative() {
        Storage.addObject("Product3", 3);
        Storage.addObject("Product4", 4);
        assertEquals(0, Storage.getFreePlaces());
    }
}

