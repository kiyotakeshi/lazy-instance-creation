package com.kiyotakeshi.lazyInstanceCreation.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean6 will be created.
 * It is required for bean5 which is singleton
 */
@Component
@Scope("prototype")
public class Bean6 {
    public Bean6() {
        System.out.println("Creating " + getClass().getSimpleName() + " - Prototype Bean that is referenced from Singleton Bean SpringBean5");
    }
}
