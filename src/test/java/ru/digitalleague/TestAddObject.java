package ru.digitalleague;

import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAddObject {
    @Test
    public void testPositive() {
        Storage.addObject("Product1", 6);
        assertTrue(Storage.isInStock("Product1"));
    }

    @Test
    public void testNegative () {
        Storage.addObject("Product1", -2);
        assertTrue(Storage.isInStock("Product1"));
    }
}
