package com.cursoemvideo.poo.aulas;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	// metodo construtor
	public ContaBanco() {
		super();
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	//Métodos personlizados

	public void estadoAtual() {
		System.out.println("--------------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
		} else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada com dinheiro");
		}else if (this.getSaldo() < 0 ){
			System.out.println("Conta não pode ser fechada pois tem débito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float valor) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		}else {
			System.out.println("Impossível depositar em uma conta fechada!");
		}
	}
	
	public void sacar(float valor) {
		if(this.getStatus()) {
			if(this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saque");
			}
		}else {
			System.out.println("Impossível sacar de uma conta fechada!");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if(this.getTipo() == "CP") {
			v = 20;
		}
		
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		}else {
			System.out.println("Impossível pagar uma conta fechada!");
		}
		
	}
	
	// Getters e Setters	

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean s) {
		this.status = s;
	}
	
	
}

