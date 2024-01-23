import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        var geluksGetal = BigDecimal.valueOf(7);
        var grootGetal = BigDecimal.valueOf(7123459L);
        var increment = BigDecimal.valueOf(0.01);

        var piString = "3.141592653";
        var pi = new BigDecimal(piString);



        var add = geluksGetal.add(grootGetal);
        System.out.println(geluksGetal);
        System.out.println(grootGetal);
        System.out.println(increment);
        System.out.println(pi);
        System.out.println(add);

        BigDecimal totaalBD = BigDecimal.ZERO;
        BigDecimal incremBD = BigDecimal.valueOf(0.01);

        for (int i = 0; i < 1000; i++) {
            totaalBD = totaalBD.add(incremBD);
        }
        System.out.println(totaalBD);

        var eenBigDecimal = BigDecimal.valueOf(5.364);
        eenBigDecimal = eenBigDecimal.setScale(2, RoundingMode.HALF_UP);
        System.out.println(eenBigDecimal);
    }
}
