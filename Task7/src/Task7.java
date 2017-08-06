import java.util.Scanner;

public class Task7 {
    //Ввести число, определить каким числам оно кратно.
    public static void main(String[] args) {

        Scanner num = new Scanner (System.in);
        int a;
        System.out.println ("Введите число");
        a = num.nextInt ();

        System.out.println ("Число " + a + " кратно: ");

        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.println (i);

            }
        }
    }
}
