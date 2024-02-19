package com.crudSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.crudSpringBoot.models.Usuarios;
import com.crudSpringBoot.repositories.UserRepository;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class postController {

    private final UserRepository userRepository;

    @Autowired
    public postController(UserRepository puserRepository) {
        this.userRepository = puserRepository;
    }

    @PostMapping("/post/usuarios")
    public ResponseEntity<?> crearUsuario(@RequestBody Usuarios usuario) {
        if (usuario.getNombre() == null || usuario.getNombre().trim().isEmpty()) {
            return new ResponseEntity<>("Nombre no puede ser null o empty", HttpStatus.BAD_REQUEST);
        }
        if (usuario.getApellido() == null || usuario.getApellido().trim().isEmpty()) {
            return new ResponseEntity<>("Apellido no puede ser null o empty", HttpStatus.BAD_REQUEST);
        }
        if (usuario.getEdad() == 0) {
            return new ResponseEntity<>("Edad no puede ser 0", HttpStatus.BAD_REQUEST);
        }

        Usuarios savedUsuario = userRepository.save(usuario);
        return new ResponseEntity<>(savedUsuario, HttpStatus.CREATED);
    }
}
