package com.helloit.fruitbasket.main;


import java.util.List;

public class PriceCalculator {
    public double calculateTotalPrice(final Basket basket) {
        double result = .0;
        final List<Fruit> fruits = basket.getFruits();
        for (Fruit fruit : fruits) {
            result += fruit.getPrice();
        }

        return result;
    }
}
