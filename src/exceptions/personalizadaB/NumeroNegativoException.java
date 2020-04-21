package exceptions.personalizadaB;

@SuppressWarnings("serial")
public class NumeroNegativoException extends Exception{

    private String nomeDoAtributo;

    NumeroNegativoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está negativo", nomeDoAtributo);
    }
}
