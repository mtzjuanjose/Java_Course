package com.ciclos;

import java.util.Scanner;

public class CicloWhileV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Ingrese un número: ");
int maxElemento;
    Scanner entradaScanner = new Scanner (System.in);
    maxElemento = entradaScanner.nextInt();
    
int cont = 0;
    
    while (cont <= maxElemento) {
    	System.out.println("Contador: "+cont);
    	cont++;
    }
entradaScanner.close();

 }
}
