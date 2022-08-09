package Bloco_1_Java;

import java.util.Scanner;

public class ExemploDoWhile {
public static void main(String[] args) {
		
		int valor,somaValor=0;
		
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("\nEntre com um valor: ");
			valor = leia.nextInt();//60 100 120 40
			somaValor += valor;
			
		}while(somaValor<=300);//Falsa

		System.out.println("\nSomatório dos valores: "+somaValor);
		
	}

}


