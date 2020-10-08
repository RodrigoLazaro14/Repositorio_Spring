package com.lojagames.global.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojagames.global.model.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

}
