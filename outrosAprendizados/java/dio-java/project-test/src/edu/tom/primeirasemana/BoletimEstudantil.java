package edu.tom.primeirasemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 3;

        if (mediaFinal < 6) 
            System.out.println("REPROVADO");
        else if (mediaFinal == 6) 
            System.out.println("PROVA MINERVA");
        else 
            System.out.println("APROVADO");
        
    }
}
