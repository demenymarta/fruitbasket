package com.helloit.fruitbasket.main.exceptions;

/**
 * Created by Student on 6/6/2016.
 */
public class AnotherException extends RuntimeException {
    public AnotherException(FruitBasketException ex) {
        super(ex);
    }
}
