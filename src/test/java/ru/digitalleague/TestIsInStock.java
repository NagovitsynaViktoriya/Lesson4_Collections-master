package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestIsInStock {

    @Before
    public void setUp(){
        Storage.addObject("Product1", 2);
    }
    @Test
    public void testPositive() {
        assertTrue(Storage.isInStock("Product1"));
    }
    @Test
    public void testNegative() {
        assertFalse(Storage.isInStock("Product2"));
    }
}
