package com.igmingo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno nacho = new Alumno ("20434500A","Ignacio Mingo",35);
		nacho.asignarCurso("Java", "Aula 4");
		nacho.setNota(4.45);	//Pepito ha optenido un 3.45
		nacho.subirNota(2);	//Pepito tiene dos puntos mas por buen comportamiento
		nacho.imprimir();		//Imprimir estado del alumno
		
	}
}
