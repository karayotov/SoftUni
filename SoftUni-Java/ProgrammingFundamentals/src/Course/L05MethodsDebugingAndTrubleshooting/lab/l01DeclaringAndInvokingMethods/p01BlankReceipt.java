package Course.L05MethodsDebugingAndTrubleshooting.lab.l01DeclaringAndInvokingMethods;

public class p01BlankReceipt {
    public static void main(String[] args) {
        
        PrintReceipt();
    }

    static void PrintReceiptHeader(){
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");

    }static void PrintReceiptBody(){
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");

    }static void PrintReceiptFooter(){
        System.out.println("------------------------------");
        System.out.println("\u00A9 SoftUni");

    }
    static void PrintReceipt(){
        PrintReceiptHeader();
        PrintReceiptBody();
        PrintReceiptFooter();
    }
}