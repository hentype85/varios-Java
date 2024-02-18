package com.crudSpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuarios {
    @Id
    private int id;

    private String nombre;
    private String apellido;
    private int edad;

    // constructor sin argumentos requerido por JPA
    public Usuarios() {

    }

    // constructor
    public Usuarios (int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // get set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // get set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // get set
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // get set
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}