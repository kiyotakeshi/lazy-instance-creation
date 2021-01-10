package com.kiyotakeshi.lazyInstanceCreation;

import com.kiyotakeshi.lazyInstanceCreation.beans.Bean7;
import com.kiyotakeshi.lazyInstanceCreation.beans.Bean8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@ComponentScan
// @ComponentScan(lazyInit = true) // set globally lazyInit true
@Configuration
@Lazy
public class AppConfig {

    @Bean
    @Lazy(value = false)
    public Bean7 springBean7() {
        return new Bean7();
    }

    @Bean
    public Bean8 springBean8() {
        return new Bean8();
    }

}
