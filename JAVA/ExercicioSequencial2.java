package Bloco_1_Java;

import java.util.Scanner;

public class ExercicioSequencial2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anos,meses,dias,diasFim;
		System.out.print("\nDigite sua idade em dias: ");
		dias = leia.nextInt();
		anos = (dias/365);
		meses = (dias%365)/30;
		diasFim = (dias%365)%30;
		System.out.print("\nAnos: "+anos);
		System.out.print("\nmeses: "+meses);
		System.out.print("\ndias: "+diasFim);
	

	}

}
