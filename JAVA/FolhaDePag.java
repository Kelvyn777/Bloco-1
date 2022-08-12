package com.generaion.holerite.model;

public class FolhaDePag {
	
	private int rf;
	private String celular;
	private String data;
	private String titular;
	private float salario;
	
	public FolhaDePag(int rf, String celular, String data, String titular, float salario) {
		this.rf = rf;
		this.celular = celular;
		this.data = data;
		this.titular = titular;
		this.salario = salario;
	}

	public int getRf() {
		return rf;
	}

	public void setRf(int rf) {
		this.rf = rf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public boolean Atualizar(float valor) {
		if(valor >= salario) {
			salario -= valor;
			return true;
		}else
			return false;
	}
	
public void visualizar() {
		
		System.out.println("**************************************");
		System.out.println("Dados da conta");
		System.out.println("**************************************");
		System.out.println("Numero de registro do funcionario: " + this.rf);
		System.out.println("Numero de celular do funcionario: " + this.celular);
		System.out.println("data de pagamento: " + this.data);
		System.out.println("Nome do funcionario: " + this.titular);
		System.out.println("valor de pagamento: " + this.salario);

}
}
