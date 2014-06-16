package com.igmingo.gui;

import com.igmingo.modelo.Alumno;
import com.igmingo.modelo.Persona;
import com.igmingo.modelo.Profesor;

public class Principal {

	public static void main(String[] args) {
	
        Persona[] lista;
        lista = new Persona[4];
	
		lista[0] = new Profesor("19782030Z", "Luis", 42, "Java", 10);	
		lista[1] = new Profesor("19782030Z", "Marta", 38, "Informática", 6);	
		lista[2] = new Alumno ("20434500A","Ignacio Mingo",32 , "Java", "Aula 4", 4.45);
		lista[3] = new Alumno ("21424400A","Juan Lopez",28 , "Java", "Aula 4", 7);
	
		listado(lista);
		
	}
	
	public static void listado(Persona[] lista) {
		System.out.println("Hay " + lista.length + " personas en la lista.");
		for (int i=0; i<lista.length; i++) {
			Persona p;
			p = lista[i];
			p.imprimir();					
		}
	}
}