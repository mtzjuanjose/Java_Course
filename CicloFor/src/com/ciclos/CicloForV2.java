package com.ciclos;

import java.util.Scanner;

public class CicloForV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	System.out.print("Ingrese un número por favor: ");
int n1=0;
    n1 = entrada.nextInt();
    
    for (int cont1=0; cont1<n1; cont1++) {
    	System.out.println("Contador = "+cont1);
    }
    
    entrada.close();
 }
}
