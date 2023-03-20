package com.eoi.springboot.database;

import com.eoi.springboot.entidades.EntidadUsuario;

import org.springframework.data.repository.CrudRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository

// CRUD refers Create, Read, Update, Delete

/**
 * The interface Repositorio usuarios.
 */
public interface RepositorioUsuarios extends CrudRepository<EntidadUsuario, Integer> {



}
