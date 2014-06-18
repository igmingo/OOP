package com.igmingo.modelo;

public abstract class Cuenta {
	
	//se pone protegido para que solo sea llamado desde las subclases
	protected Cliente cliente;
	
	//el constructror se pone protegido para que solo sea llamado desde las subclases
	protected Cuenta(Cliente cliente) {
		this.cliente = cliente;
	}
	
	protected Cuenta() {
		}

	public abstract void ingresarFondos(double euros);
	public abstract void retirarFondos(double euros);
		
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String toString() {
		return (cliente.getNombre() + " con DNI " + cliente.getDni() + " tiene una cuenta");
	}

	protected static double redondear( double numero, int decimales ) {
	    return Math.round(numero*Math.pow(10,decimales))/Math.pow(10,decimales);
	}
	
}
