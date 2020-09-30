package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//Indica que essa classe se trata de um controller
@RequestMapping("/hello")	//vamos falar qual caminho que vamos usar no postman para acessar esse ponto de acesso, esse controller o /hello é um parametro, uma string

public class HelloController 
{
	@GetMapping //sempre quando eu chamar um metodo get dentro de hello ele vai cair dentro desse metodo abaixo
	public String hello()
	{
		return "Hello World!";
	}
}
