package Bloco_1_Java;

import java.util.Scanner;

public class DoWhile {
	  public static void main(String[] args) {
	       /*Escrever um programa que receba vários números inteiros no teclado. E no
	        final imprimir a média dos números múltiplos de 3. Para sair digitar
	        0(zero).(DO...WHILE)*/

	        int num, somaM=0,mediaM=0,cont =0;
	        Scanner input = new Scanner(System.in);
	        do {
	            System.out.println("Entre um numero: ");
	            num = input.nextInt();
	            if(num %3 == 0 && num !=0) {
	                somaM +=num;
	                cont++;
	            }
	        }while(num !=0);
	        mediaM = somaM / cont;
	        System.out.println("mediaM: "+mediaM);

	    }

	}

