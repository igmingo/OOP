package com.igmingo.modelo;

public class Corriente extends Cuenta {
	
	private String ncuenta;
	private double saldo;
	private double interes;
	private double credito;
	
	public Corriente(String ncuenta, double saldo, double interes, double credito) {
		this.ncuenta = ncuenta;
		this.saldo = saldo;
		this.interes = interes;
		this.credito = credito;
	}
	
	public Corriente(Cliente cliente, String ncuenta, double saldo, double interes, double credito) {
		super (cliente);
		this.ncuenta = ncuenta;
		this.saldo = saldo;
		this.interes = interes;
		this.credito = credito;
	}

	public String getNcuenta() {
		return ncuenta;
	}

	public void setNcuenta(String ncuenta) {
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
			System.out.print( "Se han retirado " + euros + "€ de la cuenta corriente. ");
			System.out.println("No se ha cobrado penalización, pues no ha usado el crédito.");
			saldo = Cuenta.redondear(saldo-euros,2);
		} else {
			if ((euros-saldo) <= credito) {
				double comision;
				comision = (euros-saldo)*interes;
				System.out.print( "Se han retirado " + euros + "€ de la cuenta corriente. ");
				System.out.print(-(saldo-euros) + "€ a crédito, penalización de ");
				System.out.println(comision + "€ (un " + (100*interes) + "% de interés).");
				saldo = Cuenta.redondear(saldo-(euros + comision),2);
			} else { System.out.print("No tiene suficiente crédito en la cuenta corriente."); }
		}
	}

	public String toString() {
		return (super.toString() + " corriente nº" + ncuenta + " con " + Cuenta.redondear(saldo,2) + "€.");
	}
		
}
