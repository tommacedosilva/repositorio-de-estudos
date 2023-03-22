package com.cursoemvideo.projeto.pessoas;

public class ProjetoPessoas {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionaria p4 = new Funcionaria();
		
		p1.setNome("Maria");
		p2.setNome("Cinthia");
		p3.setNome("Anastacia");
		p4.setNome("Ana");
		
		p1.setIdade(25);
		p2.setIdade(26);
		p3.setIdade(35);
		p4.setIdade(40);
		
		p1.setSexo("F");
		p2.setSexo("F");
		p3.setSexo("F");
		p4.setSexo("F");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
	}
}
