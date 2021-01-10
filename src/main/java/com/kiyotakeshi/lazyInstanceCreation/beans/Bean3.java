package com.kiyotakeshi.lazyInstanceCreation.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bean3 {
    public Bean3() {
        System.out.println("Creating " + getClass().getSimpleName() + " - Prototype Bean");
    }
}
