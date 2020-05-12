package com.djhoyos.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djhoyos.apirest.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Integer>{

}
