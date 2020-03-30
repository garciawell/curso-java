package OO.heranca.desafio;

public class Carro {
    final double VELOCIDADE_MAXIMA;
    double velocidade = 100;


    Carro(int velocidadeMaxima ) {
    this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(Carro vel) {
        if(velocidade +5 > VELOCIDADE_MAXIMA) {
            velocidade = VELOCIDADE_MAXIMA;
        } else {
            vel.velocidade += 10;
        }

    }

    void frear(Carro vel) {
        vel.velocidade -= 10;
    }

}
