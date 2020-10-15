package org.generation.blogPessoal.controller;

import org.generation.blogPessoal.model.Tema;
import org.generation.blogPessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerGeral {
	//INJEÇÃO DA INTERFACE DE ACESSO AO BANCO (JPA)
	@Autowired
	private TemaRepository repository;
	
	//Redireciona o localhost:8080/ para localhost:8080/index
	@GetMapping("/")
	public String index(){
		return "index";
	}
	

	//Outro método para fazer o GetMapping
	@RequestMapping(value = "/cadastrarTema", method=RequestMethod.GET)
	public String form(){
		return "formTema";
	}

	//Um post com table tema, redirecionando para o endpoint /cadastrarTema de volta
	@PostMapping(value="/cadastrarTema")
	public String form(Tema tema){
		repository.save(tema);
		return "redirect:/cadastrarTema";
	}
}