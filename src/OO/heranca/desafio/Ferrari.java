package OO.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{

    public Ferrari(){
        this(50);
    }

    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }


    @Override
    public void ligarTurbo() {
        delta += 35;
    }

    @Override
    public void desligarTurbo() {
        delta = 15;
    }
}
