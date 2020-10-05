package com.minhaescola.global.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaescola.global.model.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long>{

	public Optional<AlunoModel> findById(Long id);
}
