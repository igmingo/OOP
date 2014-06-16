package com.igmingo.modelo;

public class Alumno extends Persona {
	String curso;
	String grupo;
	double nota;
	
	public Alumno(String _dni, String _nombre, int _edad, String _curso, String _grupo, double _nota) {
		super (_dni, _nombre, _edad);	//debe ir en la primera linea del constructor, sino el llama a super();
		curso = _curso;
		grupo = _grupo;
		nota = _nota;
	}

	public Alumno(String _dni, String _nombre, int _edad) {
		super (_dni, _nombre, _edad);	
	}
	
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		nota = redondear(nota, 1);
		if ((nota<=10)&&(nota>=0)) {
			this.nota = nota;
		} else {
			if (nota>10) { this.nota = 10;} else {this.nota = 0;}
		}
	}

	//Metodos
	
	public void asignarCurso (String _curso, String _grupo) {
		curso = _curso;
		grupo = _grupo;
	}
	
	public void imprimir() {
		
        //DecimalFormat df = new DecimalFormat("#.##");
		System.out.print("El alumno " + nombre + " con DNI " + dni + " del curso " + curso + " " + grupo + " tiene una nota de " + nota + ". ");
		System.out.println("Ha obtenido un " + this.obtenerCalificacion(nota) + ".");
	}
	
	public void subirNota(int sumar) {
		if (sumar > 0) {
		nota += sumar; // nota = nota + sumar
		setNota(nota);
		}
	}
	
	public String obtenerCalificacion(double _nota) {
		if (nota >= 9) {
			return "Sobresaliente";		
		}
		if (nota >= 7) {
			return "Notable";		
		}
		if (nota >= 6) {
			return "Bien";		
		}
		if (nota >= 5) {
			return "Aprobado";		
		}
		if (nota > 0) {
			return "Suspenso";		
		}	
		return "No presentado";
	}
	
	private double redondear( double numero, int decimales ) {
	    return Math.round(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
	}
	
}
