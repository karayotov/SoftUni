package Course.L04DataTypesAndVariables.exercices;


public class p07ExchangeVarValues {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        a += 5;
        b += 2 * a;

        System.out.printf("Before:%n");
        System.out.printf("a = %d", a);
        System.out.println();
        System.out.printf("b = %d%n", b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After:");
        System.out.printf("a = %d", a);
        System.out.println();
        System.out.printf("b = %d", b);
    }
}