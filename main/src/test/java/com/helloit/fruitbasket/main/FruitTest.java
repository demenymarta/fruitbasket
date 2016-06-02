package com.helloit.fruitbasket.main;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Student on 6/2/2016.
 */
public class FruitTest {

    @Test
    public void checkFruit() {
        final Fruit fruit = new Fruit("apple", 1.2);
        Assert.assertEquals("Checking fruit name", "apple", fruit.getName());
        Assert.assertEquals("Checking fruit price", 1.2, fruit.getPrice(), 0);
    }
}
