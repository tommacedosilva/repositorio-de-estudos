package edu.tom.segundasemana;
public class MinhaClasse {
    
    public static void main (String [] args) {
        //String meuNome = "Tom";
        //int anoFabricacao = 2024;
        //boolean simNao = true;
        //anoFabricacao = 2019;
        String primeiroNome = "Tom";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
