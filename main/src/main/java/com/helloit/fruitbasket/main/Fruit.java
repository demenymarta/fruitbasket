package com.helloit.fruitbasket.main;

import java.util.Objects;

public class Fruit extends  BasketItem {

    private double price;

    public Fruit(final String name, final double price) {
        super(name);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return super.getName() + " fruit";
    }

    @Override
    public Fruit clone() throws CloneNotSupportedException {
        return (Fruit) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        return this.price == fruit.price && this.getName() == fruit.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.price);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "price=" + price +
                "} " + super.toString();
    }


}
