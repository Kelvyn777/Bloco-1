package Bloco_1_Java;

import java.util.Scanner;

/*Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/


public class ExerciciosArrays {

	public static void main(String[] args) {
		
		  Scanner leia = new Scanner(System.in);
		  int[] numero = new int [6];
		  int numerosPares = 0, numerosImpares = 0,somaPar = 0, quantImpares=0;
		  
		  for (int i = 0; i < 6; i++) {
			  System.out.print("\nEntre com um numero: ");
			  numero [i]= leia.nextInt();  
			  

	           

	           if (numero[i] % 2 == 0){
	        	  
	               somaPar += numero[i];
	               numerosPares ++;
	               

	           }else{
	        	   
	         numerosImpares++ ;

	           }

	       }
		  System.out.print("\nNumeros pares digitados: ");
		  for (int i = 0; i < 6; i++) {
			  if (numero[i] % 2 == 0) {
				  System.out.print(numero [i]+" ");
			  }
		  }
		  
			 

	       System.out.print("\nSoma dos numeros pares: " + somaPar);

	       System.out.print("\nNumeros impares digitados: " );
	       
			  for (int i = 0; i < 6; i++) {
				  if (numero[i] % 2 == 1) {
					  System.out.print(numero [i]+" ");
				  }
			  }

	       System.out.println("\nQuantidade de impares digitados: " + numerosImpares);        
		
		}
		
			
}
	

	

