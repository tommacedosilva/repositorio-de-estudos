public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 25;
        double valorSolicitado = 18;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;            
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
