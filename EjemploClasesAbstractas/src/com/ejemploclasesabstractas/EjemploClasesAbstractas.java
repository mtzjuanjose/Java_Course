package com.ejemploclasesabstractas;

import com.abstracto.domain.FiguraGeometrica;
import com.abstracto.domain.*;

public class EjemploClasesAbstractas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creeación de objetos
		FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
		FiguraGeometrica triangulo = new Triangulo("Triángulo");
		FiguraGeometrica circulo = new Circulo("Círculo");
		
		System.out.println(rectangulo);
		rectangulo.dibujar();
		
		System.out.println("");
		System.out.println(triangulo);
		triangulo.dibujar();
		
		System.out.println("");
		System.out.println(circulo);
		circulo.dibujar();
		
		

	}

}
