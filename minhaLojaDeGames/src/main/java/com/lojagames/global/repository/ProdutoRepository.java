package com.lojagames.global.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojagames.global.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{

	public List<ProdutoModel> findAllByNomeProdutoContainingIgnoreCase(String nome);

}
