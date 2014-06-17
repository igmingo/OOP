package com.igmingo.modelo;

public abstract class Cuenta {
	
	public Cliente cliente;

	public abstract void ingresarFondos(double euros);
	public abstract void retirarFondos(double euros);
	public abstract void verDetalles();
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
