package aula12;

import aula12.Animal;

public class Mamifero extends Animal {
	private String corPelo;
	

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Correndo");		
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSons() {
		System.out.println("som de Mamífero");
	}
	
}
