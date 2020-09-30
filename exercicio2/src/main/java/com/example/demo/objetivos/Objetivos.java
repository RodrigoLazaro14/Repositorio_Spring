package com.example.demo.objetivos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	@GetMapping
	public String objetivos() {
		return "Meus objetivos para esta semana são: \n- Compreender melhor o Spring; \n- Fazer mais atividades como essa; \n- Rever alguns vídeos da plataforma, para melhor absorção do assunto.";
	}
}
