package com.kiyotakeshi.lazyInstanceCreation.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component
public class Bean5 {

    @Autowired
    private Bean6 bean6;

    public Bean5() {
        System.out.println("Creating " + getClass().getSimpleName() + " - Singleton Bean that has dependency on Prototype Bean SpringBean6");
    }
}
