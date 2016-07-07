package com.helloit.fruitbasket.main;

/**
 * Created by Student on 7/7/2016.
 */
public class BasketItem implements Cloneable{
    private String name;

    public BasketItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public BasketItem clone() throws CloneNotSupportedException {
        return (BasketItem) super.clone();
    }

    @Override
    public String toString() {
        return "BasketItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
