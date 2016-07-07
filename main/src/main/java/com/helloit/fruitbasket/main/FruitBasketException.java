package com.helloit.fruitbasket.main;

/**
 *
 */
public class FruitBasketException extends RuntimeException {

    public FruitBasketException() {

    }

    public FruitBasketException(final String message) {
        super(message);
    }

    public FruitBasketException(String s, final Throwable throwable) {
        super(throwable);
    }
}
