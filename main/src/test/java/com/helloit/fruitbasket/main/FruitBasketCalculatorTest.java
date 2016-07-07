package com.helloit.fruitbasket.main;

import com.helloit.fruitbasket.main.exceptions.AnotherFruitBasketException;
import com.helloit.fruitbasket.main.exceptions.FruitBasketException;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class FruitBasketCalculatorTest {
    @Test
    public void checkTotalPrice() throws AnotherFruitBasketException {
        final PriceCalculator priceCalculator = new PriceCalculator();
        Basket basket = new Basket();
        basket.addFruit(new Fruit("apple", 1.2));
        basket.addFruit(new Fruit("banana", 1.2));

        final double totalPrice = priceCalculator.calculateTotalPrice(basket);

        Assert.assertEquals("Checking price",2.4, totalPrice, 0);
    }

    @Test
    public void exceptionTest() {
        try {
            final PriceCalculator priceCalculator = new PriceCalculator();
            Basket basket = new Basket();

            try {
                final double totalPrice = priceCalculator.calculateTotalPrice(basket);
                Assert.assertEquals("Checking price", 2.4, totalPrice, 0);
            } catch (final FruitBasketException ex) { //| AnotherFruitBasketException ex
                System.out.print("FruitBasketException!!!! " + ex.getMessage());
                throw new FruitBasketException("Test exception", ex);
//            throw new AnotherException(ex);
//        } catch (AnotherFruitBasketException ex) {
//            System.out.print("AnotherFruitBasketException!!!! " + ex);

            }
        } catch (RuntimeException ex) {
            System.out.print(ex);

        }

    }

}
