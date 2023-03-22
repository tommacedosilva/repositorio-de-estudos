package aula12;

public class Aula12 {
	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru mCan = new Canguru();
		Cachorro mDog = new Cachorro();
		Tartaruga rTar = new Tartaruga();
		Cobra rCob = new Cobra();
		Goldfish pGol = new Goldfish();
		Arara aAra = new Arara();
		
		
		m.alimentar();
		r.setCorEscama("verde");
		p.emitirSons();
		a.fazerNinho();
		mCan.setCorPelo("Marrom");
		mDog.setCorPelo("Branco");
		rTar.setCorEscama("Verde Musgo");
		rCob.emitirSons();
		pGol.setCorEscama("Dourada");
		aAra.setCorPena("Amarela");
	}
}
