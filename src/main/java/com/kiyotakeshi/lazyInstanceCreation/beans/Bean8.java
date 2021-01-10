package com.kiyotakeshi.lazyInstanceCreation.beans;

public class Bean8 {
    public Bean8() {
        System.out.println("Creating " + getClass().getSimpleName() + " - Bean from Configuration class");
    }
}
