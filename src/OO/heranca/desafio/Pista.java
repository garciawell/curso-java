package OO.heranca.desafio;

public class Pista {
    public static void main(String[] args) {
        Carro p1 = new Carro();
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

        p2.frear(p2);
        System.out.println("CARRO VELOCIDADE 2 " + p2.velocidade);
    }
}
