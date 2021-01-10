package com.kiyotakeshi.lazyInstanceCreation.beans;

public class Bean7 {
    public Bean7() {
        System.out.println("Creating " + getClass().getSimpleName() + " - Bean from Configuration class");
    }
}
