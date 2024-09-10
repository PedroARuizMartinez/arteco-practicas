package com.example.demo.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ControllerAdvice
public class GlobalControllerAdvice {

	@ModelAttribute("personas")
	public List<Persona> personas() {
		// Crear una lista de personas y agregar algunas personas a ella
		List<Persona> personas = new ArrayList<>();

		Persona persona1 = new Persona();
		persona1.setId(1L);
		persona1.setNombre("Juan");
		persona1.setApellidos("Pérez");
		personas.add(persona1);

		Persona persona2 = new Persona();
		persona2.setId(2L);
		persona2.setNombre("María");
		persona2.setApellidos("Gómez");
		personas.add(persona2);

		return personas;
	}
}
