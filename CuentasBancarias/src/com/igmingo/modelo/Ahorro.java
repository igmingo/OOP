package com.igmingo.modelo;

public class Ahorro extends Cuenta {
	
	private String ncuenta;
	private double saldo;
	private double interes;
	private double credito;
	
	public Ahorro(String ncuenta, double saldo, double interes, double credito) {
		this.ncuenta = ncuenta;
		this.saldo = saldo;
		this.interes = interes;
		this.credito = 0;
	}
	
	public Ahorro(Cliente cliente, String ncuenta, double saldo, double interes, double credito) {
		super (cliente);
		this.ncuenta = ncuenta;
		this.saldo = saldo;
		this.interes = interes;
		this.credito = 0;
	}
		
	public String getNcuenta() {
		return ncuenta;
	}

	public void setNcuenta(String ncuenta) {
		this.ncuenta = ncuenta;
	}
		
	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
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
		saldo = Cuenta.redondear(saldo+cantidad,2);
	}

	public void retirarFondos(double euros) {
		if (euros<=saldo) {
			saldo = Cuenta.redondear(saldo - (euros + (interes*euros)),2);
			System.out.print("Se han retirado " + euros + "€ de la cuenta de ahorro. ");
			System.out.println("Se penalizado con " + Cuenta.redondear((interes*euros),2) + "€.");
		} else {System.out.println("No se puede realizar esta operación en la cuenta de ahorro.");}
	}
	
	public String toString() {
		return (super.toString() + " de ahorro nº" + ncuenta + " con " + Cuenta.redondear(saldo,2) + "€.");
	}
	
}
