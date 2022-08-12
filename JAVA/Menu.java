package com.generation.conta;

import com.generation.conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, "123", "CC", "João da Silva", 2000.0f);
		c1.visualizar();
		
		Conta c2 = new Conta(123457, "123", "CC", "Kelvyn", 2000000.0f);
		c2.visualizar();
		
		//System.out.println("Saldo da conta c1: " + c1.getSaldo());
	//	System.out.println("Saldo da conta c2: " + c2.getSaldo());
		c1.setSaldo(3000.0f);
		//System.out.println("Saldo atualizado da conta c1: " + c1.getSaldo());
		c2.setTitular("Kelvyn Farias");
		//System.out.println("Saldo atualizado da conta c2: " + c2.getTitular());
		
		Conta c3 = new Conta();
		c3.visualizar();
		
		c3.setNumero(123458);
		c3.setTitular("Pericles");
		c3.setSaldo(1000000.0f);
		c3.visualizar();
		
		c2.sacar(1000.0f);
		c2.visualizar();
	}

}
