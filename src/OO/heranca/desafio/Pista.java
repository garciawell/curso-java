package OO.heranca.desafio;

public class Pista {
    public static void main(String[] args) {
        Carro p1 = new Carro(120);
        Civic p2 = new Civic();

        System.out.println("CARRO VELOCIDADE " + p1.velocidade);
        p1.acelerar(p1);
        p1.acelerar(p1);
        p1.acelerar(p1);
        p1.acelerar(p1);
        System.out.println("CARRO VELOCIDADE " + p1.velocidade);
        p1.frear(p1);
        p1.frear(p1);
        System.out.println("CARRO VELOCIDADE " + p1.velocidade);
        Ferrari c2 = new Ferrari(25);
        c2.ligarTurbo();
        c2.ligarTurbo();

        p2.frear(p2);
        System.out.println("CARRO VELOCIDADE 2 " + p2.velocidade);
        System.out.println("FERRARI " + c2.VELOCIDADE_MAXIMA);
    }
}
