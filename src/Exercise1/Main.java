package Exercise1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        BigDecimal bda = new BigDecimal(1.2345);

        System.out.println(bigDecimalToDouble(bda));
        System.out.println(bigDecimalReverse(bda));
    }

    //1. method1
    public static double bigDecimalToDouble(BigDecimal value) {

        BigDecimal roundedValue = value.setScale(2, RoundingMode.HALF_EVEN);
        double roundedValueDouble = roundedValue.doubleValue();

        return roundedValueDouble;
    }

    //2. method2
    public static BigDecimal bigDecimalReverse(BigDecimal value) {

        BigDecimal roundedValue = value.setScale(1, RoundingMode.HALF_EVEN);

        MathContext mc = new MathContext(1);
        BigDecimal reverse;

        reverse = roundedValue.negate();

        return reverse;
    }

}
