package com.cursoemvideo.poo.aulas;

public class Caneta2 {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	public Caneta2(String modelo, float ponta, String cor, boolean tampada) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
		this.tampada = tampada;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println(("Está tampada? " + this.tampada));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public Caneta2(String m, String c, float p) { // método Construtor
		this.modelo = m;
		this.cor = c;
		this.ponta = p;
		this.tampar();
	}
	
	public String getModelo(){
		return this.modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println(("Está tampada? " + this.tampada));
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}*/
}
	
