package OO.heranca.desafio;

public class Carro {
    double velocidade = 100;

    void acelerar(Carro vel) {
        vel.velocidade += 10;
    }

    void frear(Carro vel) {
        vel.velocidade -= 10;
    }

}
