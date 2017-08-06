import java.util.Scanner;

public class Task10 {

    static int expandNumber(int value) {
        int result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

    static void inversion(int value) {
        System.out.println("value     = " + value + ";");
        System.out.println("inversion = " + expandNumber(value) + ";");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter value: ");
        int a = scanner.nextInt ();
        inversion (a);
    }

}
