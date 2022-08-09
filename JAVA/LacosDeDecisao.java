package Bloco_1_Java;

import java.util.Scanner;

public class LacosDeDecisao {
	public static void main(String[] args) 
	{
		
		Scanner ler = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.printf("\nDigite sua idade: ");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("\nDigite sua nome: ");
		nome = ler.nextLine();
		System.out.printf("\nSeu nome: %s ",nome);
		System.out.printf("\nSua idade: %d",idade);
		
		
		if (idade>= 10 && idade<= 14)
		{
			System.out.println("\nSua categoria e infatil...");	
		}
		else if (idade>= 15 && idade<= 17) 
		{
			System.out.println("\nSua categoria e juvenil...");
		}
		else if (idade>= 18 && idade<= 25) 
		{
			System.out.println("\nSua categoria e adulto...");
		}
		}
	
}

