/*
 * Pr�ctica de captura y lanzamiento de excepciones.
 * Impide crear un objeto Autoescuela con un alumno con una edad <18 y >64.
 */

package com.igmingo.gui;

import com.igmingo.modelo.Autoescuela;

public class Principal {

	public static void main(String[] args) throws Exception {
		Autoescuela a1 = new Autoescuela ("Nacho", 25); // Esto no d� excepcion porque es una edad v�lida
		
		//Ahora probaremos a capturar el error al modificar una edad
		try {
			a1.setEdad(7);
			System.out.println(a1.getNombre() + " tiene " + a1.getEdad() + " a�os.");
		} catch (Exception miexcepcion) {
			System.out.println("Error: "+ miexcepcion.getMessage());
		}
	}
}
