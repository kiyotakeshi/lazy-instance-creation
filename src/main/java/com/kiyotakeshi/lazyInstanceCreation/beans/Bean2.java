package com.kiyotakeshi.lazyInstanceCreation.beans;

import org.springframework.stereotype.Component;

/**
 * Singletons by default are eager to instantiated
 */
@Component
public class Bean2 {
    public Bean2() {
        System.out.println("Creating " + getClass().getSimpleName() + " - Singleton Bean");
    }
}
