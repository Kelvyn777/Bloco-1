package Bloco_1_Java;

import java.util.Scanner;

public class AtividadeWhile {

	public static void main(String[] args) {
		   /*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	        21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	        idade for =-99. (WHILE)*/
	     

	        int idade = 0, menos21=0, mais50=0;
	        Scanner leia = new Scanner(System.in);
	        while(idade <=99) {
	            System.out.println("Entre com a sua idade: ");
	            idade = leia.nextInt();
	            if(idade<21 && idade <=99) {
	                menos21++;
	            }else if(idade >50) {
	                mais50++;
	            }
	        }System.out.println("Tiveram "+menos21+" com menos de 21 anos");
	        System.out.println("Tiveram "+mais50+" com mais de 50 anos");
	    }
	}
	
