package com.igmingo.gui;

import com.igmingo.modelo.Coche;
import com.igmingo.modelo.Bicicleta;
import com.igmingo.modelo.Vehiculo;

public class Juego {

	public static void main(String[] args) {
		Vehiculo b1=new Bicicleta("Orbea", "CX", "Rojo", "9876", "Tracción Animal", 125, 5);
		Vehiculo c2=new Coche("Seat", "Ibiza", "Amarillo", "2345", "Gasoil", 45, 6);
		Vehiculo c3=new Coche("Toyota", "Yaris", "Gris", "2345", "Gasoil", 45, 5.5);
		
		detalles (b1);
		detalles (c2);
		detalles (c3);
		System.out.println(b1);
		System.out.println(c2);
		System.out.println(c3);
	}
	
	public static void detalles (Vehiculo v) {

		v.imprimir();

		if (v instanceof Coche) {
			Coche c = (Coche) v; //transforma un vehiculo en coche (volvemos hacia su forma primitiva)
			System.out.println("Es un coche que consume " + c.getConsumo());
		}
	}
}