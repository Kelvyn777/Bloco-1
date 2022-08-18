package com.generation.animal.model;

public class Cavalo extends Animal {


	public static void main(String[] args) {}
		
		public Cavalo(String nome, int idade, String sv, String acao) {
			super(nome, idade, sv, acao);
		}

		
		public void som () {
			super.som();
			System.out.println("\nSom que o animal: Relincho");
		}

		public void visualizar () {
			super.visualizar();
}
}
