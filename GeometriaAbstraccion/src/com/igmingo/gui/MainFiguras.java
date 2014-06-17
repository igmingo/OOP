package com.igmingo.gui;

import com.igmingo.modelo.Circunferencia;
import com.igmingo.modelo.Figura;
import com.igmingo.modelo.Rectangulo;

public class MainFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura f1=new Rectangulo(5,4);
		
		System.out.println(f1.detalles());
		System.out.println(f1.area());
		System.out.println(f1.perimetro());

		Figura f2=new Circunferencia(4);
		System.out.println(f2.detalles());
		System.out.println(f2.area());
		System.out.println(f2.perimetro());
	
	}
}
