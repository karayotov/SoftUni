package Course.L04DataTypesAndVariables.exercices;

import java.math.BigDecimal;


public class p01PracticeIntegers {
    public static void main(String[] args) {

        byte bytes = -100;
        short shorts = 128;
        int intes = 64876;

        java.math.BigDecimal ind = new BigDecimal("2147483648");
        BigDecimal bigerInd = new BigDecimal(-1141583228);
        BigDecimal bigerBigerInd = new BigDecimal("-1223372036854775808");
        System.out.println(bytes);
        System.out.println(shorts);
        System.out.println(intes);
        System.out.println(ind);
        System.out.println(bigerInd);
        System.out.println(bigerBigerInd);
    }
}