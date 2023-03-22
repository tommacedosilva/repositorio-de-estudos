package projetovideo;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 2 de Python");
		v[2] = new Video("Aula 5 de JavaScript");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Azdrubal", 23, "M", "azd23");
		g[1] = new Gafanhoto("Carlota", 25, "F", "carlotinha");
		
		
		
		System.out.println(v[0].toString());
		System.out.println(g[0].toString());

	}

}
