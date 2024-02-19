package com.crudSpringBoot.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


// Usuarios es una Entidad JPA, se mapea a una tabla de la db
@Entity
public class Usuarios {
    @Id // identificador de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generar automaticamente el id para la PK. Generar valores se delega a la db
    private int id;

    private String nombre;
    private String apellido;
    private int edad;

    // constructor sin argumentos requerido por JPA
    public Usuarios() {

    }

    // constructor
    public Usuarios (String pNombre, String pApellido, int pEdad) {
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.edad = pEdad;
    }

    // get set
    public int getId() {
        return id;
    }
    public void setId(int pId) {
        this.id = pId;
    }

    // get set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String pNombre) {
        this.nombre = pNombre;
    }

    // get set
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String pApellido) {
        this.apellido = pApellido;
    }

    // get set
    public int getEdad() {
        return edad;
    }
    public void setEdad(int pEdad) {
        this.edad = pEdad;
    }
}
