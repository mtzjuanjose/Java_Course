package com.claseobject;

public class ClaseObject {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado ("Tamara", 10000);
		Empleado emp2 = new Empleado ("Tamara", 10000);
		
		compararObjetos(emp1, emp2);

	}
	
	private static void compararObjetos(Empleado emp1, Empleado emp2) {
		//LLAMADA METODO toString
		//por default se manda llamar el metodo toString dentro de println
		System.out.println("Contenido objeto: "+emp1);
		
		//Revisión por Referencia
		System.out.println("\nMetodo Referencia:");
		if (emp1 == emp2) {
			System.out.println("Los objetos tienen la misma dirección de memoria (REFERENCIA DEL OBJETO");
		} else {
			System.out.println("Los objetos tienen distinta dirección de memoria");
		}
		
		//Revision por el metodo equals
	    System.out.println("\nMetodo equals:");
		if (emp1.equals(emp2)) {
			System.out.println("Los objetos tienen el mismo contenido, son iguales");
		} else {
			System.out.println("Los objetos NO tienen el mismo contenido, NO son iguales");
		}
		
		//Revision por hashCode
		System.out.println("\nMetodo hashCode:");
		if(emp1.hashCode() == emp2.hashCode()) {
			System.out.println("Los objetos tienen el mismo código ****hash****");
		}else {
			System.out.println("Los objetos No tienen el mismo código ****hash****");
		}
	}

}
