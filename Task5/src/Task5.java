import java.util.Scanner;

public class Task5 {
    //Ввести число, определить четное или нет.
    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        int a;

        for (int i = 0; i < 10; i++) {


            System.out.println ("Enter first num: ");
            a = num.nextInt ();

            if (a % 2 == 0) {
                System.out.println ("Even number");

            } else {
                System.out.println ("Odd number");
            }
        }
    }
}
