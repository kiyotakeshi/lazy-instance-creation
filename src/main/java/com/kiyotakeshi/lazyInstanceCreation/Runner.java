package com.kiyotakeshi.lazyInstanceCreation;

import com.kiyotakeshi.lazyInstanceCreation.beans.Bean3;
import com.kiyotakeshi.lazyInstanceCreation.beans.Bean4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        // Bean3 is Prototype scope, so instance is created when we request it explicitly
        // context.getBean(Bean3.class);

        // Bean4 is Singleton scope, but set @Lazy
        // context.getBean(Bean4.class);
    }
}
