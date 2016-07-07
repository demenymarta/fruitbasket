package com.helloit.fruitbasket.main;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Student on 7/7/2016.
 */
public class BasketTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException  {
        Basket basket = new Basket();
        basket.addFruit(new Fruit("apple", 1.2));
        basket.addFruit(new Fruit("banana", 1.2));

        Basket clonedBasket = basket.clone();
        clonedBasket.addFruit(new Fruit("orange", 99));

        Assert.assertNotEquals("They are not equals because they are cloned with clone method", basket.getFruits().size(), clonedBasket.getFruits().size());

        Basket constructorBasket = new Basket(basket);
        constructorBasket.addFruit(new Fruit("pear", 13));

        Assert.assertNotEquals("They are not equals because they are cloned with copy constructor ", basket.getFruits().size(), constructorBasket.getFruits().size());

    }
}
