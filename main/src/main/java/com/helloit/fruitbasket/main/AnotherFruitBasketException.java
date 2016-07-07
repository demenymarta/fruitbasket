package com.helloit.fruitbasket.main;

/**
 *
 */
public class AnotherFruitBasketException extends Exception {

    public AnotherFruitBasketException() {

    }

    public AnotherFruitBasketException(final String message, final Throwable throwable) {
        super(throwable);
    }

    public AnotherFruitBasketException(final String message) {
        super(message);
    }
}
