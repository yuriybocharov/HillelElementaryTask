import java.util.Scanner;

public class Task11 {


    static void weight(int number1, double number) {

        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        if (number1 == 1) {
            x1 = (int) number / 1_000;
            x2 = (int) (number - x1 * 1_000);
            x3 = (int) ((number - x1 * 1_000 - x2) * 1000);
        }

        if (number1 == 2) {
            x1 = (int) number / 1_000_000;
            x2 = (int) (number - x1 * 1_000_000) / 1000;
            x3 = (int) (number - x1 * 1_000_000 - x2 * 1000);
            x4 = (int) ((number - x1 * 1_000_000 - x2 * 1000 - x3) * 1000);
        }

        if (x1 > 0) {
            System.out.print (x1 + " tons ");
        }
        if (x2 > 0) {
            System.out.print (x2 + " kilograms ");
        }
        if (x3 > 0) {
            System.out.print (x3 + " grams ");
        }
        if (x4 > 0) {
            System.out.print (x4 + " micrograms");
        }
        System.out.println ("");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Enter the mass");
        double a = scanner.nextDouble ();
        System.out.println ("Enter the unit of measure");
        System.out.println ("1 - kilograms");
        System.out.println ("2 - grams");
        int b = scanner.nextInt ();
        weight (b, a);
    }

}