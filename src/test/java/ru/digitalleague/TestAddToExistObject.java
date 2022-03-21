package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAddToExistObject {

    @Test
    public void testPositive() {
        Storage.addObject("Product1", 1);
        Storage.addToExistObject("Product1", 3);
        assertEquals(4, Storage.getProductAmount("Product1"));
    }

    @Test
    public void testNegative1() {
        Storage.addObject("Product2", 4);
        assertEquals(false, Storage.addToExistObject("Product2", 7));
    }


    //Это баг??? Ну типа должно сообщение же какое то вылазить, что такого товара еще нет на складе
    @Test
    public void testNegative2() {
        //Storage.addToExistObject("Product3", 3);
        //assertFalse(Storage.isInStock("Product3"));
        assertEquals(false,Storage.addToExistObject("Product3", 3));
    }
}
