package com.lojagames.global.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojagames.global.model.CategoriaModel;
import com.lojagames.global.repository.CategoriaRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> findAllCategoria(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModel> findByIdCategoria(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<CategoriaModel>> findByDescricaoCategoria(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoCategoriaContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	public ResponseEntity<CategoriaModel> postCategoria(@RequestBody CategoriaModel categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<CategoriaModel> putCategoria(@PathVariable Long id, @RequestBody CategoriaModel categoria){
		categoria.setId(id);
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable long id){
		repository.deleteById(id);
	}

}
