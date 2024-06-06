package com.cursoemvideo.relacao.classes;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	/* Regras do UEC:
	 * Só pode ser marcada entre lutadores da mesma categoria
	 * Defasiado e desafiante devem ser lutadores diferentes
	 * Só pode acontecer se estiver aprovada
	 * Só pode ter como resultado a vitória de um dos lutadores ou o empate.
	 */
	
	// Métodos
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && (l1 != l2)) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			System.out.println("============= RESULTADO DA LUTA ===============");
			switch (vencedor) {
			case 0: // Empate
				System.out.println("EMPATE!");
				desafiado.empatarLuta();
				desafiante.empatarLuta();
				break;
			case 1: // Desafiado Vence
				System.out.println("VITÓRIA DE " + this.desafiado.getNome());
				desafiado.ganharLuta();
				desafiante.perderLuta();
				break;
			case 2: // Desafiante Vence
				System.out.println("VITÓRIA DE " + this.desafiante.getNome());
				desafiado.perderLuta();
				desafiante.ganharLuta();
				break;
			}
		} else {
			System.out.println("A luta não pode acontecer!");
		}
		System.out.println("============= RESULTADO DA LUTA ===============");
	}

	
	
	// Getters e Setters
	
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
	
}
