public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        return cep;

    }
}
