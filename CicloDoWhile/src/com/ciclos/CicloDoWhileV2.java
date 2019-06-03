package com.ciclos;

import java.util.Scanner;

public class CicloDoWhileV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner input = new Scanner (System.in);
	System.out.print("Ingrese un número: ");
int num1=0;
int contador=0;

    num1 = input.nextInt();    
    do {
    	System.out.println("Contador = "+contador);
    	contador++;
    }while(contador<=num1);
    
    input.close();
 }
}
