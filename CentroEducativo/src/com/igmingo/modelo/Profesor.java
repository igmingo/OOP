package com.igmingo.modelo;

public class Profesor extends Persona {
	private String especialidad;
	private int experiencia;
	
	public Profesor(String _dni, String _nombre, int _edad, String _especialidad, int _experiencia) {
		super (_dni, _nombre, _edad);
		especialidad = _especialidad;
		experiencia = _experiencia;
	}

	public Profesor(String _dni, String _nombre, int _edad) {
		super (_dni, _nombre, _edad);
	}
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public void asignarNivel(String _especialidad, int _experiencia) {
		experiencia = _experiencia;
		especialidad = _especialidad;
	}
	
	public void imprimir() {
		System.out.println("El profesor " + nombre + " con DNI " + dni + " tiene " + experiencia + " años de experiencia en la especialidad de " + especialidad + ".");
	}
		
}
