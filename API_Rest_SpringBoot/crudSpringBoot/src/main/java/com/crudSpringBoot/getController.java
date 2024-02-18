package com.crudSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudSpringBoot.models.Usuarios;
import com.crudSpringBoot.repositories.UserRepository;
import java.util.List;


@RestController
public class getController {

    private final UserRepository userRepository;

    @Autowired
    public getController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public String Saludo() {
        return "Hola Spring-Boot!!";
    }

    @GetMapping("/usuarios")
    public List<Usuarios> todosLosUsuarios() {
        return userRepository.findAll();
    }
}