package com.djhoyos.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.djhoyos.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Integer>{

	public Usuario findByUsername(String username);
}
