package com.cursoemvideo.modelo.heranca;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		// Pessoa p1 = new Pessoa(); -> Classe abstrata não pode ser instanciada
		Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();
		Professor p1 = new Professor();
		
		/*v1.setNome("Antonieta");
		*v1.setIdade(23);
		*v1.setSexo("F");
		*System.out.println(v1.toString());
		* -> Dados de visitante 
		*/ 
		
		/*
		*a1.setNome("Miguel");
		*a1.setIdade(19);
		*a1.setSexo("M");
		*a1.setMatricula(1919);
		*a1.setCurso("ADS");
		*a1.pagarMensalidade();
		* -> Dados de aluno 
		*/
		
		b1.setNome("Josefina");
		b1.setCurso("Biologia");
		b1.setMatricula(1234);
		b1.setIdade(20);
		b1.pagarMensalidade();
		b1.toString();
		
	}
}
