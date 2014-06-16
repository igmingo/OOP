package com.igmingo.gui;

import com.igmingo.modelo.Coche;
import com.igmingo.modelo.Moto;

public class Juego {

	public static void main(String[] args) {
		Moto m1=new Moto("Yamaha", "CX", "Rojo", "9876", "Diesel", 125, 5);
		Coche c2=new Coche();
		
		Coche c3=new Coche("Toyota", "Yaris", "Gris", "2345", "Gasoil", 45, 5.5);
	
		c3.imprimir();
		m1.imprimir();

//		System.out.println("El coche 1 ha consumido " + c1.consumido(50) + " litros en 50km.");
//		System.out.println("El coche 2 ha consumido " + c2.consumido(30 , 1.6) + "€ en 30km.");
//		System.out.println("El coche 3 ha consumido " + c3.consumido(20) + " litros en 30km.");

	}
}