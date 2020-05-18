package com.djhoyos.apirest.models.services;

import com.djhoyos.apirest.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
}
