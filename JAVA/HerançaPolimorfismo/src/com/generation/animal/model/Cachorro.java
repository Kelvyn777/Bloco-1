package com.generation.animal.model;

public class Cachorro extends Animal{

		public static void main(String[] args) {
			
		}
		
		public Cachorro(String nome, int idade, String sv, String acao) {
			super(nome, idade, sv, acao);
		
	}
		
		public void som () {
			super.som();
			System.out.println("\nSom que o animal: latido/AuAu");
		}

		public void visualizar () {
			super.visualizar();
		}
			
}

