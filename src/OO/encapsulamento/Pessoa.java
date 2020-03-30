package OO.encapsulamento;

public class Pessoa {
    private  String nome;
    private int idade;

    public Pessoa(int idade) {
   setIdade(idade);
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if(novaIdade >= 0 ){
            this.idade = novaIdade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
