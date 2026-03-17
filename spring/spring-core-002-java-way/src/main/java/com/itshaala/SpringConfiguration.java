package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.itshaala")
public class SpringConfiguration {

    @Bean(name = "product")
    @Scope("singleton")
    public Product getProduct() {
        return new Product(1, "camera", 9099);
    }

}
