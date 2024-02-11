package com.crudSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getController {

    @GetMapping("/")
    public String hola() {
        return "test ok";
    }
}
