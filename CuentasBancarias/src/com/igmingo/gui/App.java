package com.igmingo.gui;

import com.igmingo.modelo.Ahorro;
import com.igmingo.modelo.Corriente;
import com.igmingo.modelo.Cuenta;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cuenta[] listacuentas = new Cuenta [4];
	
	listacuentas[0] = new Corriente (1111, 200, 0.06);
	listacuentas[1] = new Ahorro (2222, 180, 0.02);
	listacuentas[2] = new Ahorro (3333, 220, 0.02);
	listacuentas[3] = new Corriente (4444, 800, 0.02);

	listado(listacuentas);
	
	listacuentas[1].retirarFondos(30);
	
	listado(listacuentas);
	
	}

	public static void listado(Cuenta[] array) {
		System.out.println("Hay " + array.length + " cuentas en el listado.");
		
		for (int i=0; i<array.length; i++) {
			Cuenta p;
			p = array[i];
			p.verDetalles();
		}
	}
}
