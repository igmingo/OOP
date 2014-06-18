package com.igmingo.gui;

import com.igmingo.modelo.Figura;

// Este interface obliga a que si se implementa en una clase, tenga los metodos de ponerColor y pintar
public interface IRepresentacionGrafica {
	
	public void ponerColor(String codigo);
	public int pintar(Figura grafica);

}
