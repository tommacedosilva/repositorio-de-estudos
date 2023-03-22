package aula12;

public class Peixe extends Animal {
	private String corEscama;
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Comendo substâncias");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Nadando");
		
	}

	@Override
	public void emitirSons() {
		System.out.println("Peixe não emite som");
		
	}

}
