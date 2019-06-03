package com.autoboxingautounboxing;

public class AutoBoxingAutoUnboxing {

	public static void main(String[] args) {
		
		//AutoBoxing (Cambia de valores primitivos a Objetos)
		Integer enteroObj = 10;
		Float flotanteObj = 15.2F;
		Double dobleObj = 40.1;
		
		System.out.println("Autoboxing");
		System.out.println("Entero Obj. "+enteroObj.intValue());
		System.out.println("Float Obj. "+flotanteObj.floatValue());
		System.out.println("Double Obj. "+dobleObj.doubleValue());
		
		
		//AutoUnboxing(cambia de Objetos a valores primitivos)
		int entero = enteroObj;
		float flotante = flotanteObj;
		double doble = dobleObj;
		
		System.out.println("\nAutounboxing");
		System.out.println("Entero: "+entero);
		System.out.println("Flotante: "+flotante);
		System.out.println("Doble: "+doble);
		
 }
}
