package com.cursoemvideo.poo.aulas;

public class BancoExecuta {
	public static void main(String[] args) {
		ContaBanco t1 = new ContaBanco();
		t1.setNumConta(1111);
		t1.setDono("Dr. Chapatim");
		t1.abrirConta("CC");
		t1.depositar(100);
		
		ContaBanco t2 = new ContaBanco();
		t2.setNumConta(2323);
		t2.setDono("Dona Florinda");
		t2.abrirConta("CP");
		t2.depositar(500);
		t2.sacar(100);
		
		t1.fecharConta();
		
		
		t1.estadoAtual();
		t2.estadoAtual();
	}
	
	
	
}
