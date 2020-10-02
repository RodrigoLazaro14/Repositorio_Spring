package com.blogrodrigo.global.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogrodrigo.global.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);	
//findAll = busca todos pelo (Titulo)
// Containing = mesma coisa do like no sql tudo que contenha os caracteres dentro dessa variavel ele vai trazer
//IgnoreCase = é utilizado para não levar em consideração o que é maiúsculo ou minúsculo, ele vai pegar tudo e padronizar para minusculo e fazer a busca do parametro com os dados que contem dentro dele.
}