package com.ejemploinstanceof;

public class EjemploInstaceOf {

	public static void main(String[] args) {
		FiguraGeometrica figura;
		figura = new Elipse();
		
		//Determina solo un tipo el que corresponda con la jeraquia
		determinaTipo(figura);
		//Determina todo los tipos posibles
		System.out.println("\nTodos sus tipos");
		determinaTodosLosTipos(figura);
		
	}
	
	private static void determinaTodosLosTipos(FiguraGeometrica figura) {
		if (figura instanceof Elipse) {
			//Procesa algo particular de la elipse
			System.out.println("Es una Elipse");
		}
		
		if (figura instanceof Circulo) {
			//Procesa algo particular del circulo
			System.out.println("Es un Círculo");
		}
		
		if (figura instanceof FiguraGeometrica) {
			//Procesa algo particular de la FiguraGeometrico
			System.out.println("Es una Figura Geométrica");
		}
		
		if (figura instanceof Object) {
			//Procesa algo particular de la clase Object
			System.out.println("Es un Object");
		} else {
			System.out.println("NO SE ENCONTRÓ EL TIPO");
		}
	}
		
		
		private static void determinaTipo(FiguraGeometrica figura) {
			if (figura instanceof Elipse) {
				//Procesa algo particular de la elipse
				System.out.println("Es una Elipse");
			}
			
			else if (figura instanceof Circulo) {
				//Procesa algo particular del circulo
				System.out.println("Es un Círculo");
		    }
			
			else if (figura instanceof FiguraGeometrica) {
				//Procesa algo particular de la FiguraGeometrica
				System.out.println("Es una Figura Geométrica");
			} 
			
			else if(figura instanceof Object) {
				//Procesa algo particular de la clase Object
				System.out.println("Es un Object");
			}else {
				System.out.println("NO SE ENCONTRÓ EL TIPO");
			}		
		
	}
}
