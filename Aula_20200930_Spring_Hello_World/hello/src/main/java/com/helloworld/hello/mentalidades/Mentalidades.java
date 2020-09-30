package com.helloworld.hello.mentalidades;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidades")
public class Mentalidades 
{
	@GetMapping
	
	public String mentalidades() 
	{
		return "Nesta atividade trabalhei a mentalidade de persistência e a mentalidade de crescimento.";
	}
}
