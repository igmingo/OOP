package com.igmingo.gui;

import com.igmingo.modelo.Ahorro;
import com.igmingo.modelo.Cliente;
import com.igmingo.modelo.Corriente;
import com.igmingo.modelo.Cuenta;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Cuenta[] listacuentas = new Cuenta [4];
	
	Cliente nacho = new Cliente ("Nacho", "20454900J");
	Cliente antonio = new Cliente ("Antonio", "20454900J");
	Cliente pepe = new Cliente ("Pepe", "20454900J");
	Cliente ana = new Cliente ("Ana", "20454900J");
	
	listacuentas[0] = new Corriente (nacho, "1111", 500, 0.06, 200);
	listacuentas[1] = new Ahorro (antonio, "2222", 100, 0.02, 0);
	listacuentas[2] = new Ahorro (pepe, "3333", 0, 0.02, 0);
	listacuentas[3] = new Corriente (ana, "4444", 550, 0.06, 500);

	listado(listacuentas);
	listacuentas[0].retirarFondos(400);
	listacuentas[1].retirarFondos(180);
	listacuentas[2].retirarFondos(380);
	listacuentas[3].retirarFondos(1050);
	
	listado(listacuentas);
	}

	public static void listado(Cuenta[] array) {
		System.out.println("\nHay " + array.length + " cuentas en el listado:\n");
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
