package Veiculo;
public class Autodromo {
    public static void main(String[] args) {
        Carro F1 = new Carro();
        F1.setChassi("191919");
        //F1.ligar();

        Moto harley = new Moto();
        harley.setChassi("888888");
        harley.ligar();

        Veiculo coringa = F1;
        coringa.ligar();
    }
}
