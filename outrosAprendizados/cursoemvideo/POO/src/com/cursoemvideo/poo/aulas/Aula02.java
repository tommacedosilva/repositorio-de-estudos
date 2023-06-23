package com.cursoemvideo.poo.aulas;

public class Aula02 {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
		// c1.ponta = 0.5f;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		
		// iniciar segunda caneta
		Caneta c2 = new Caneta();
		c2.modelo = "SysDoctor";
		c2.cor = "Preta";
		// c2.ponta = 0.3f;
		c2.tampar();
		c2.status();
		c2.rabiscar();
		
		// iniciar outra classe
		Garrafa g1 = new Garrafa();
		g1.modelo = "Squeeze Spotify";
		g1.cor = "Branca";
		g1.quantidade = 300;
		g1.status();
		g1.beber();
		
	}
}
