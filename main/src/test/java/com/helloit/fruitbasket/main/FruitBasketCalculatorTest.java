package com.helloit.fruitbasket.main;


import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class FruitBasketCalculatorTest {
    @Test
    public void checkTotalPrice() {
        final PriceCalculator priceCalculator = new PriceCalculator();
        Basket basket = new Basket();
        basket.addFruit(new Fruit("apple", 1.2));
        basket.addFruit(new Fruit("banana", 1.2));

        final double totalPrice = priceCalculator.calculateTotalPrice(basket);

        Assert.assertEquals("Checking price",2.4, totalPrice, 0);
    }
}
