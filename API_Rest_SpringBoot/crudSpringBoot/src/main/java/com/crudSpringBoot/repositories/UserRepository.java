package com.crudSpringBoot.repositories;

import com.crudSpringBoot.models.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuarios, Integer> {

}