package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada() {
        System.out.println("CONTROLANDO A ENTRADA DE ITENS");
    }
    private void controlarSaida() {
        System.out.println("CONTROLANDO A SAÍDA DE ITENS");
    }
    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }
    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}
