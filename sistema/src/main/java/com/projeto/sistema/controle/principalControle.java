package com.projeto.sistema.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principalControle {
	@GetMapping("/administrativo")
	public String acessaPrincipal() {
		return "administrativo/home";
	}
}
