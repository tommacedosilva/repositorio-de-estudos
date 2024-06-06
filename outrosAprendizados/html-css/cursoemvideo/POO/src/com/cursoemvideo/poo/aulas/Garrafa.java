package com.cursoemvideo.poo.aulas;

public class Garrafa {
	String modelo;
	String cor;
	int quantidade;
	boolean fechada;
	boolean cheia;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Quantidade: " + this.quantidade + "ml");
		System.out.println("Está cheia? " + this.cheia);
		System.out.println("Está fechada? " + this.fechada);
	}
	
	void beber() {
		if(cheia == true) {
			System.out.println("Opa, pode beber");
		}else {
			System.out.println("Precisa encher a garrafa");
		}
	}
	
	 
}
