package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonaController {


	@GetMapping("/")
	public String index(Model modelo) {
		modelo.addAttribute("page", "indexContent");
		return "index"; // Devuelve el nombre de la plantilla Thymeleaf sin la extensión (.html)
	}

	@GetMapping("/pagina1")
	public String pagina1(Model modelo) {
		modelo.addAttribute("page", "pagina1");
		return "index"; // Nombre de la vista (archivo HTML)
	}

	@GetMapping("/pagina2")
	public String pagina2(Model modelo, @RequestParam(name = "id", required = false, defaultValue = "0") Long id) {
		modelo.addAttribute("id", id);
		modelo.addAttribute("page", "pagina2");
		return "index"; // Nombre de la vista (archivo HTML)
	}

	@GetMapping("/navbar")
	public String navbar() {
		return "navbar";
	}


}










