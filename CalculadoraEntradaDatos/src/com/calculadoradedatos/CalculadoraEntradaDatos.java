package com.calculadoradedatos;

import java.util.*;
import static com.calculadora.Operaciones.sumar;

public class CalculadoraEntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Proporcione en primer valor:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		System.out.println("Proporcione el segundo valor:");
		int b = scan.nextInt();
		
		int result = sumar(a, b);
		System.out.println("El resultado de la suma es: "+result);
		
        scan.close();
	}
}
