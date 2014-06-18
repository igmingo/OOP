package com.igmingo.modelo;

public class Autoescuela {

	public String nombre;
	public int edad;

	public Autoescuela (String nombre, int edad) throws Exception {
		this.nombre = nombre;
		this.setEdad(edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad<18) {
			throw new Exception ("La edad " + edad + " está por debajo del máximo legal, 18 años.");
		}
		if (edad>64) {
			throw new Exception ("La edad " + edad + " está por encima del máximo legal, 64 años.");
		}
		this.edad = edad;
	}
}
