package com.igmingo.modelo;

public class Coche {
	
	//Atributos
	private String color;		// Rojo, amarillo, etc
	private String combustible;	// Diesel, Gasolina, Biodiesel
	private int deposito;		// en litros
	private double consumo;		// consumo l/100km
	
	//Constructores
	public Coche() {
		color = "Azul";
		combustible = "Gasolina";
		deposito = 125;
		consumo = 11;
	}
	
	public Coche(String color, String combustible, int deposito, double consumo) {
		this.color = color;
		this.combustible = combustible;
		this.deposito = deposito;
		this.consumo = consumo;
	}

	//getters and setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

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
	
	public void estado() {
		System.out.println("El Coche " + color + " consume " + consumo);
	}
}