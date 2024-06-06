package com.cursoemvideo.modelo.heranca;

public class Tecnico extends Aluno{
	private int registroTec;
	
	public void praticarTec() {
		System.out.println(this.getNome() + " está praticando o técnico do curso " + this.getCurso());
	}

	public int getRegistroTec() {
		return registroTec;
	}

	public void setRegistroTec(int registroTec) {
		this.registroTec = registroTec;
	}
	
}
