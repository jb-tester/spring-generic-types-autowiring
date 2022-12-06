package com.example.springgenerictypesautowiring.idea307753;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfig {


    @Bean
    public Bar<?,?> getBar() {
        return new Bar<>();
    }
}
