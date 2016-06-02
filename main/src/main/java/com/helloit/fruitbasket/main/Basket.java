package com.helloit.fruitbasket.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Basket {
    private List <Fruit> fruits;

    public Basket() {
        fruits = new ArrayList<Fruit>();
    }

    public void addFruit(final Fruit fruit) {
        this.fruits.add(fruit);
    }

    public Fruit getFruit(final String fruitName){
        Fruit result = null;
        Iterator<Fruit> iterator = this.getFruits().iterator();
        while (iterator.hasNext()) {
            Fruit fruit = iterator.next();
            if (fruit.getName().equals(fruitName)) {
                result = fruit;
                break;
            }
        }
        for (Fruit fruit : getFruits()) {
            if (fruit.getName().equals(fruitName)) {
                result = fruit;
                break;
            }

        }

        return result;
    }

    public List<Fruit> getFruits() {
        return Collections.unmodifiableList(fruits);
    }
}
