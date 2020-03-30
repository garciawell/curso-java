package OO.heranca.desafio;

public class Civic extends Carro{

    Civic(){
        super(50);
    }

    void frear(Carro vel) {
        vel.velocidade -= 50;
    }

}
