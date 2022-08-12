package com.generaion.holerite;

import com.generaion.holerite.model.FolhaDePag;

public class Holerite {

	public static void main(String[] args) {
		
		FolhaDePag Ho = new FolhaDePag(456734754, "11946807138", "10/04/2022", "Kelvyn Faryas", 15000.0f);
		
		Ho.visualizar();
		
		Ho.setSalario(20000.0f);
		
		System.out.println("Aumento salarial do funcionario de 15000.0 para: " + Ho.getSalario());
		
		Ho.Atualizar(5000.0f);
		Ho.visualizar();

		Ho.setTitular("Kelvyn Farias");
		//
		System.out.println("Nome do funcionario atualizado: " + Ho.getTitular());
		
	}

}
