package com.example.springgenerictypesautowiring.idea307753;

import com.example.springgenerictypesautowiring.idea247434.Foo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseBars {

    @Autowired
    Bar<String,String> bar;

    @Autowired
    BarService<Integer,Integer> barService;  // error is reported

    public Bar<String, String> getBar() {
        return bar;
    }

    public BarService<Integer, Integer> getBarService() {
        return barService;
    }
}
