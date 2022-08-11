package Bloco_1_Java;

import java.util.Scanner;

public class ExercicioSequencial {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int diasDoMes=30,diasDoAno=365,anos,meses,dias;
				
		System.out.println("\nColoque sua idade em: ");
		System.out.print("\nAnos: ");
		anos = leia.nextInt();
		System.out.print("\nMeses: ");
		meses = leia.nextInt();
		System.out.print("\nDias: ");
		dias = leia.nextInt();
		dias += (anos*diasDoAno) + (meses*diasDoMes);
		System.out.println("\nSua idade em dias e: "+dias+" dias");
		
	}

}
