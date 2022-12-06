package com.example.springgenerictypesautowiring.idea247434;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfig {

    @Bean
    public <K,V> Foo<K,V> getFoo() {
        return new Foo<K,V>();
    }

}
