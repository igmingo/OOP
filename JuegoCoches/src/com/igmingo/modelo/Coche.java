package com.igmingo.modelo;

public class Coche extends Vehiculo {
	
	//Atributos
	private String combustible;	// Diesel, Gasolina, Biodiesel
	private int deposito;		// en litros
	private double consumo;		// consumo l/100km
	
	//Constructores
	public Coche() {
		combustible = "Gasolina";
		deposito = 125;
		consumo = 11;
	}
	
	public Coche(String combustible, int deposito, double consumo) {
		this.combustible = combustible;
		this.deposito = deposito;
		this.consumo = consumo;
	}
	
	//Constructor con superclase
	
	public Coche(String marca, String modelo, String color, String numeroSerie,
			String combustible, int deposito, double consumo) {
		super(marca, modelo, color, numeroSerie);
		this.combustible = combustible;
		this.deposito = deposito;
		this.consumo = consumo;
	}	
	
	//getters and setters

	public String getCombustible() {
		return combustible;
	}
	
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	//métodos de la clase
	public double consumido (double kms) {
		double kmsrec = kms/100;
		return kmsrec*consumo;
	}

		public double consumido (double kms, double precio) {
			double kmsrec = kms/100;
			return kmsrec*consumo*precio;
		}
	
	public void imprimir() {
		System.out.println("Coche " + color + " de marca " + marca + " modelo " + modelo + ".");
	}
	
}