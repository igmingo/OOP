package com.igmingo.modelo;

public class Persona {
	protected String dni;
	protected String nombre;
	protected int edad;

	public Persona() {
	}
	
	public Persona(String _dni, String _nombre, int _edad) {
		dni = _dni;
		nombre = _nombre;
		edad = _edad;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void imprimir() {
        //DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(nombre + " con DNI " + dni + " tiene " + edad + " años.");
	}

//	public void listado(Persona[] _lista) {
//		for (int i=0; i<_lista.length; i++) {
//			Persona p;
//			p = _lista[i];
//			p.imprimir();
//		}
//	}
}
