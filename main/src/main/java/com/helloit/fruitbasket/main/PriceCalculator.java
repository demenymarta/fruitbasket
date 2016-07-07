package com.helloit.fruitbasket.main;


import com.helloit.fruitbasket.main.exceptions.AnotherFruitBasketException;

import java.util.List;

public class PriceCalculator {

    public double calculateTotalPrice(final Basket basket)  {

        if (basket.getFruits().size() == 0) {
           // throw new AnotherFruitBasketException("Empty basket");
        }
        double result = .0;

        final List<Fruit> fruits = basket.getFruits();
        for (Fruit fruit : fruits) {
            result += fruit.getPrice();
        }

        return result;
    }
}
