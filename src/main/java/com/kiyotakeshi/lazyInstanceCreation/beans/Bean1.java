package com.kiyotakeshi.lazyInstanceCreation.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Singletons by default are eager to instantiated
 */
@Component
//@Lazy(value = false) // if globally lazyInit settings is true
public class Bean1 {
    public Bean1() {
        System.out.println("Creating " + getClass().getSimpleName() + " - Singleton Bean");
    }
}
