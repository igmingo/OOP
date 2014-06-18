package com.igmingo.modelo;

import com.igmingo.gui.IRepresentacionGrafica;

public abstract class  Figura implements IRepresentacionGrafica{
	
	public abstract double area();
	public abstract double perimetro ();
	public String detalles () {
		return "Figura vacia";
	}
}
