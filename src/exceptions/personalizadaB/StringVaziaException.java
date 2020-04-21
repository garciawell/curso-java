package exceptions.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception{

    private String nomeDoAtributo;

    StringVaziaException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está Vazio", nomeDoAtributo);
    }
}
