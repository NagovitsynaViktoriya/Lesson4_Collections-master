package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class TestRemoveObject {

    @Before
    public void setUp(){
        Storage.addObject("Product1", 2);
    }

    @Test
    public void testPositive() {
        Storage.removeObject("Product1");
        assertFalse(Storage.isInStock("Product1"));
    }

    @Test
    public void testNegative() {
        assertEquals(false, Storage.removeObject("Product2"));
    }
}
