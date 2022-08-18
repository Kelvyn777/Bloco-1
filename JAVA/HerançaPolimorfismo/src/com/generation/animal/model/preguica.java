package com.generation.animal.model;

public class preguica extends Animal{

	

	public static void main(String[] args) {}
		
		public preguica(String nome, int idade, String sv, String acao) {
			super(nome, idade, sv, acao);
		 }

		public void som () {
			super.som();
			System.out.println("\nSom que o animal: To cansado");
		}

		public void visualizar () {
			super.visualizar();
	}
}
