package com.abstracto.domain;

public class Triangulo extends FiguraGeometrica {
	
	public Triangulo(String tipoFigura) {
		super(tipoFigura);
	}
	
	public void dibujar() {
		//Implementacion del metodo dibujar heredado de la clase FiguraGeometrica
		System.out.println("Aqu� deber�a de dibujar un: "+this.getClass().getSimpleName());
	}

}
