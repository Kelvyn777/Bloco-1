package Bloco_1_Java;

import java.util.Scanner;

public class AtividadeFOR {

	public static void main(String[] args) {
		int num, par=0, impar=0;
		
		Scanner leia = new Scanner (System.in);
	    
		for(int x = 1;x<=10;x++){
			System.out.printf("Entre com um numero: ");
			num = leia.nextInt();
			
		if (num % 2 == 0){
			par++;
		}
		else {
			impar++;
		}
		
		}
System.out.println("numero de pares: "+par);
System.out.println("numero de impares: "+impar);
	}
	
}
