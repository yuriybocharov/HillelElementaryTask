import java.util.Scanner;

public class Task6 {
    //Ввести число, определить простое ли оно
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a, b;

        System.out.println ("Введите число");


        for (int n = 0; n < 10; n++) {
            b = 0;
            a = scanner.nextInt ();
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) b++;
            }
            if (b <= 2) {
                System.out.println ("Простое");
            } else {
                System.out.println ("нет");
            }
        }

    }
}
