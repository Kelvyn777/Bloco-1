package Bloco_1_Java;

import java.util.Scanner;

/*
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

 */

public class ExerciciosArraysMatriz {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		
    int [][] numero = new int [3][3];
    int contNum=0,Valores=0,i,c,x;
    
       for(i=0;i<3;i++) {
    	for(c=0;c<3;c++){
    		System.out.print("\nEntre com um numero: ");
    		x = leia.nextInt();
    		if(x >10) {
    		
            contNum++;
    			
    		}
    		
         }
    	
       }
       System.out.println("\nA quantidadede numeros superior a dez e: "+contNum);
	}
	
}


