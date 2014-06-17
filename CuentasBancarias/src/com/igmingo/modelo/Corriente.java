package com.igmingo.modelo;

public class Corriente extends Cuenta {
	
	private int ncuenta;
	private double saldo;
	private double interes;
	
	public Corriente(int ncuenta, double saldo, double interes) {
		this.ncuenta = ncuenta;
		this.saldo = saldo;
		this.interes = interes;
	}

	public int getNcuenta() {
		return ncuenta;
	}

	public void setNcuenta(int ncuenta) {
		this.ncuenta = ncuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public void ingresarFondos(double euros) {
		System.out.println((-saldo) + "Se han ingresado " + euros + "€.");
		saldo += euros;
	}

	public void retirarFondos(double euros) {
		if (euros<=saldo) {
			System.out.print( "Se han retirado " + euros + "€. ");
			System.out.println("No se ha cobrado penalización.");
			saldo -= euros;
		} else {
			double cantidad;
			cantidad = euros - (interes*euros);
			System.out.print((-(saldo-euros)) + "€ a crédito");
			System.out.println(" a un " + (100*interes) + "% de interés.");
			saldo -= cantidad;
		}
	}

	public void verDetalles() {
		// TODO Auto-generated method stub
		System.out.println("La cuenta corriente " + ncuenta + " tiene " + saldo + "€.");
	}
	
	
		
}
