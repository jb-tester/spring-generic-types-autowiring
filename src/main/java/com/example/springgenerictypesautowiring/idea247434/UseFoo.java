package com.example.springgenerictypesautowiring.idea247434;

import com.example.springgenerictypesautowiring.idea307753.Bar;
import com.example.springgenerictypesautowiring.idea307753.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseFoo {

    @Autowired Foo<String,String> foo;

    public Foo<String, String> getFoo() {
        return foo;
    }
}
