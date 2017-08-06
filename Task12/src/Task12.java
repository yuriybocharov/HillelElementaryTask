import java.util.Scanner;

public class Task12 {
    private static boolean palindrom(int x) {
        String str = Integer.toString (x);

        return str.equals (new StringBuilder ().append (str).reverse ().toString ());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt ();
        System.out.println (palindrom (a));
    }
}