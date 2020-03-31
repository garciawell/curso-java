package OO.heranca.desafio;

public class Carro {
    final double VELOCIDADE_MAXIMA;
    double velocidade = 100;
    double delta = 100;


    Carro(int velocidadeMaxima ) {
    this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(Carro vel) {
        if(velocidade + delta > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            vel.velocidade += delta;
        }

    }

    void frear(Carro vel) {
        vel.velocidade -= delta;
    }

}
