package com.crudSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

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
    public ResponseEntity<String> Saludo() {
        String txt = "Hola Spring-Boot!!";
        return new ResponseEntity<>(txt, HttpStatus.OK);
    }

    @GetMapping("/get/usuarios")
    public ResponseEntity<List<Usuarios>> todosLosUsuarios() {
        List<Usuarios> usuarios = userRepository.findAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

}