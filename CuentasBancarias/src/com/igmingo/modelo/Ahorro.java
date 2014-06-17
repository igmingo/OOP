package com.igmingo.modelo;

public class Ahorro extends Cuenta {
	
	private int ncuenta;
	private double saldo;
	private double interes;
	
	public Ahorro(int ncuenta, double saldo, double interes) {
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
		double cantidad;	
		cantidad = (euros + (interes*euros));
		System.out.println((0-saldo) + "Se han ingresado " + cantidad + "€.");
		saldo += cantidad;
		// TODO Auto-generated method stub
	}

	public void retirarFondos(double euros) {
		if (euros<=saldo) {
			saldo = saldo - (euros + (interes*euros));
			System.out.print("Se han retirado " + euros + "€. ");
			System.out.println("Se penalizado con " + (interes*euros) + "€.");
		} else {System.out.println("No se puede realizar esta operación.");}
	}

	public void verDetalles() {
		// TODO Auto-generated method stub
		System.out.println("La cuenta de ahorro " + ncuenta + " tiene " + saldo + "€.");
	}
		
}
