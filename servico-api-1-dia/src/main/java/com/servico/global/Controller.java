package com.servico.global;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired // injeta o jpa
	private ServicoRepository repository;

	@GetMapping("/servicos")
	public List<ServicoModel> buscarTodos() { // o list seria como se fosse o select * from do mysql
		return repository.findAll();
	}
	
	// requerer a resposta, save
	@PostMapping ("/servicos")
	public ServicoModel criar(@RequestBody ServicoModel model) {
		repository.save(model);
		return model;
	}
}
