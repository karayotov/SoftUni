package L04DataTypesAndVariables.exercices;

import java.math.BigDecimal;

public class p02PracticeFloatingPointNumbers {
    public static void main(String[] args) {
        java.math.BigDecimal bigDecimal = new BigDecimal(0);

        BigDecimal firsNum = new BigDecimal("3.141592653589793238");
        BigDecimal secondNum = new BigDecimal("1.60217657");
        BigDecimal thurdNum = new BigDecimal("7.8184261974584555216535342341");

        System.out.println(firsNum);
        System.out.println(secondNum);
        System.out.println(thurdNum);
    }
}