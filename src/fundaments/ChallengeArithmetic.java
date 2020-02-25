package fundaments;

public class ChallengeArithmetic {
    public static void main(String[] args) {

      double sum1 = Math.pow(6 * (3+2), 2);
      double sum2 = 3 * 2;

      double sumGeneral =  sum1 / sum2;

      double sum3 = (1-5) * (2-7);
      double sum4 = 2;
      double  sumGeneral2 = Math.pow(sum3 / sum4, 2);

      double sumWrapper = Math.pow(sumGeneral - sumGeneral2, 3) / Math.pow(10, 3);

        System.out.println("RESULTADO FINAL:" + sumWrapper);

    }
}
