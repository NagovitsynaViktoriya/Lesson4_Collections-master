package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class TestAddNewObject {

    @Test
    public void testPositive() {
        Storage.addNewObject("Product1", 2);
        assertTrue(Storage.isInStock("Product1"));
    }


    //Это баг? Метод должен возвращать false, потому что Product2 уже есть и это не новый объект
    @Test
    public void testNegative() {
        Storage.addNewObject("Product2", 3);
        assertEquals(false, Storage.addNewObject("Product2", 6));
        //assertEquals(3, Storage.getProductAmount("Product2"));
    }
}
