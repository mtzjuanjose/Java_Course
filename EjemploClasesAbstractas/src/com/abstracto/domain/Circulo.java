package com.abstracto.domain;

public class Circulo extends FiguraGeometrica {
	
	public Circulo (String tipoFigura) {
		super(tipoFigura);
	}
	
	public void dibujar () {
		//Comportamiento de la subclase
		System.out.println("Aqu� deber�a de dibujar un: "+this.getClass().getSimpleName());
	}
	

}
