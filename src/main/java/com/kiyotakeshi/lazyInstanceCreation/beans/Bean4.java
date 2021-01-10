package com.kiyotakeshi.lazyInstanceCreation.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Bean4 {
    public Bean4() {
        System.out.println("Creating " + getClass().getSimpleName() + " - Lazy Singleton Bean");
    }
}
