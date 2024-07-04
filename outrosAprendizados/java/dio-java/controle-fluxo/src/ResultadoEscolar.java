public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        /* Senão Se
        if (nota >= 7) {
            System.out.println("Aprovado");            
        } 
        
        else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        }
        
        else {
            System.out.println("Reprovado");
        }
        */

        /* Ternária simples
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        */

        /* Ternária completa */
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        

    }
}
