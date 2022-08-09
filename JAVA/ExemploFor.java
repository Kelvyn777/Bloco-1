package Bloco_1_Java;

import java.util.Scanner;

public class ExemploFor {
public static void main(String[] args) {
		
		float n1,n2,n3,media,somaMedia=0,mg;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=3;x++) {
			
			System.out.println("\nEntre com a primeira nota:");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota:");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota:");
			n3 = leia.nextFloat();
			media = (n1+n2+n3)/3; // 6.5 5
			System.out.println("\nMédia: "+media);
			somaMedia += media;// -= /= *=  somaMedia = somaMedia + media
			
		}
		
		mg = somaMedia / 3;
		System.out.println("\nMédia geral: "+mg);


	}

}
