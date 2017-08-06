import java.util.Scanner;

public class Task1 {

        public static void main(String[] args) {

            //Среднее арифметическое значение двух чисел.

            Scanner scanner = new Scanner (System.in);
            System.out.println ("Ведите числа: ");

            double a = scanner.nextDouble ();
            double b = scanner.nextDouble ();

            double resalt = (a + b) / 2;
            System.out.println (resalt);
        }
    }

