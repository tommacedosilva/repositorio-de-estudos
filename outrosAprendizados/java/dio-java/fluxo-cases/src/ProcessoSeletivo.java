import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
    }
    static void imprimirCandidatos() {
        String [] candidatos = {"FELIPE", "MÁRCIA", "JÚLIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MÁRCIA", "JÚLIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " soliticou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
        } 
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
