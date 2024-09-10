package com.example.demo.controller;

public class Persona {

	Long id;

	String nombre;
	String apellidos;

	public String getApellidos() {

		return apellidos;
	}

	public void setApellidos(String apellidos) {

		this.apellidos = apellidos;
	}

	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public Long getId() {

		return id;
	}

	public void setId(Long id) {

		this.id = id;
	}

	@Override
	public String toString() {

		return "Persona{" +
			"id=" + id +
			", nombre='" + nombre + '\'' +
			", apellidos='" + apellidos + '\'' +
			'}';
	}
}
