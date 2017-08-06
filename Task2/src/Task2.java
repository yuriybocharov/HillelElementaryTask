import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//среднее арифметическое значение произвольного количества чисел.
        Scanner scanner = new Scanner (System.in);

        int a;
        double c = 0;
        double result;
        int b;
        System.out.println ("Какое количество чисел вы хотите ввести: ");
        a = scanner.nextInt ();
        System.out.println ("Введите " + a + " чисел");

        for (int i = 0; i < a; i++) {
            b = (int) ((Math.random () * 1000) + 1);
            System.out.print ((i + 1) + " число: " + b + "; ");
            c += b;
        }
        result = c / a;
        System.out.println ();
        System.out.println ("среднее арифметическое значение " + result);
    }
}
