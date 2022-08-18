package com.generation.animal;

import com.generation.animal.model.Cachorro;
import com.generation.animal.model.Cavalo;
import com.generation.animal.model.preguica;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro("Zeus", 2, "Cachorro", "correndo");
		c1.visualizar();
		c1.som();
		
		Cavalo ca1 = new Cavalo("Negão", 5, "Cavalo", "correndo");
		ca1.visualizar();
		ca1.som();
		
		preguica pre1 = new preguica("Ronaldo", 2, "Preguica", "correndo");
		pre1.visualizar();
		pre1.som();

	}

}
