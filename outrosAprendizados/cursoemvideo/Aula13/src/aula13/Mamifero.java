package aula13;

public class Mamifero extends Animal{
	protected String corPelo;
	

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
