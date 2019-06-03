package com.abstracto.domain;

public class Rectangulo extends FiguraGeometrica{
	
	public Rectangulo(String tipoFigura) {
		super(tipoFigura);
	}
	
	public void dibujar() {
		//Comportamiento de la subclase
		System.out.println("Aqu� deber�a dibujar un: "+this.getClass().getSimpleName());
	}

}
