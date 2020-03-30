package OO.heranca;

public class Heroi extends Jogador {

    Heroi() {
        super(0, 0);
    }

    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }


}
