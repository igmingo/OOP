package com.igmingo.gui;

import com.igmingo.modelo.Alumno;
import com.igmingo.modelo.Persona;
import com.igmingo.modelo.Profesor;

public class Principal {

	public static void main(String[] args) {
	
//        Persona[] lista;
//        lista = new Persona[4];

		Persona[] listap = new Persona [4]; // es lo mismo que Persona listap[] = new Persona [4];
        
		//Persona es una superclase de Alumno y Profesor
		listap[0] = new Profesor("18832030Z", "Luis", 42, "Java", 10);	
		listap[1] = new Profesor("19782030J", "Marta", 38, "Informática avanzada", 6);	
		listap[2] = new Alumno ("20434500A","Ignacio Mingo",32 , "Java", "Aula 4", 4.45);
		listap[3] = new Alumno ("21424400F","Juan Lopez",28 , "C++", "Aula 4", 7);
	
		listado(listap);
		
	}
	
	public static void listado(Persona[] lista) {
		System.out.println("Hay " + lista.length + " personas en la lista.");
		
//		for (int i=0; i<lista.length; i++) {
//			Persona p;
//			p = lista[i];
//			p.imprimir();					
//		}
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Profesor) {
				System.out.print("Es un profesor.");
				Profesor pro = (Profesor) lista [i];
				System.out.println(lista[i].getNombre() + " con " + pro.getExperiencia() + " años de experiencia.");
			} else {
				if (lista[i] instanceof Alumno) {
					System.out.print("Es un alumno.");
					Alumno alu = (Alumno) lista [i];
					System.out.println(lista[i].getNombre() + " con una nota de " + alu.getNota());
				}
			}
		}
	}
}