package com.igmingo.modelo;

public class Vehiculo {
	protected String marca;
	protected String modelo;
	protected String color;
	protected String numeroSerie;

	public Vehiculo() {
	}
	
	public Vehiculo(String marca, String modelo, String color, String numeroSerie) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numeroSerie = numeroSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	public void imprimir() {
		System.out.println("Vehículo " + color + " de marca " + marca + " modelo " + modelo);
	}
	
}
