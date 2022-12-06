package com.example.springgenerictypesautowiring;

import com.example.springgenerictypesautowiring.idea307753.UseBars;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGenericTypesAutowiringApplication implements CommandLineRunner {

    private final UseBars useBars;

    public SpringGenericTypesAutowiringApplication(UseBars useBars) {
        this.useBars = useBars;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringGenericTypesAutowiringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(useBars.getBar());
        System.out.println(useBars.getBarService());
    }
}
