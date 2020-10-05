package com.minhaescola.global.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.minhaescola.global.model.AlunoModel;
import com.minhaescola.global.repository.AlunoRepository;

@RestController
public class AlunoController {
		
	@Autowired // injeta o jpa
	private AlunoRepository repository;
	
	@GetMapping("/aluno")
	public List<AlunoModel> buscarTodos() { // o list seria como se fosse o select * from do mysql
		return repository.findAll();
	}
	
	@GetMapping("/aluno/{id}")
	public Optional<AlunoModel> buscarPorId(@PathVariable Long id) {
		return repository.findById(id);
	}
	
	@PostMapping("/aluno")
	public AlunoModel cadastro(@RequestBody AlunoModel model) {
		repository.save(model);
		return model;
	}
	
	@PutMapping("/aluno/{id}")
	public AlunoModel atualizar(@PathVariable Long id, @RequestBody AlunoModel model) {
		model.setId(id);
		repository.save(model);
		return model;
	}
	
	@DeleteMapping("/aluno/{id}")
	public String remover(@PathVariable Long id) {
		repository.deleteById(id);
		return "Sucesso";
		
	}
	
}
