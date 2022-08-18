package com.generation.animal.model;

public abstract class Animal {
	
	private String nome;
	private int idade;
	private String sv;
	private String acao;
	
	
	public Animal(String nome, int idade, String sv, String acao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sv = sv;
		this.acao = acao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSv() {
		return sv;
	}


	public void setSv(String sv) {
		this.sv = sv;
	}


	public String getAcao() {
		return acao;
	}


	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	public void som () {
		
	}

	public void visualizar() {
		System.out.println("\n----------------------------");
		System.out.println("\nNome do animal: " + this.getNome());
		System.out.println("\nEspecie do animal: " + this.getSv());
		System.out.println("\nIdade do animal: " + this.getIdade());
		System.out.println("\nO animal está: " + this.getAcao());
		
	}
}
