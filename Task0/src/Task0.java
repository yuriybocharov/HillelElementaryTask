import java.util.Scanner;

public class Task0 {

    //Калькулятор

    private static void start() {

        Scanner scanner = new Scanner (System.in);
        System.out.println ();
        System.out.println ("Меню:");
        System.out.println ("Для выбора введите цифру:");
        System.out.println ();

        String s;
        String n;
        double a;
        double b;
        double result;


        while (true) {

            System.out.println ();
            System.out.println ("1.Введите число");
            System.out.println ("2. Выход");

            s = scanner.nextLine ();

            if (s.equals ("1")) {

                System.out.println ("Введите первое число");

                a = scanner.nextInt ();

                System.out.println ("Выбрите действие");

                n = scanner.next ();

                System.out.println ("Введите второе число");

                b = scanner.nextInt ();

                if (n.equals ("+")) {
                    result = a + b;
                    System.out.println ();
                    System.out.println (a + " + " + b + " = " + result);
                }
                if (n.equals ("-")) {
                    result = a - b;
                    System.out.println ();
                    System.out.println (a + " - " + b + " = " + result);
                }
                if (n.equals ("*")) {
                    result = a * b;
                    System.out.println ();
                    System.out.println (a + " * " + b + " = " + result);
                }
                if (n.equals ("/")) {
                    if (a == 0 || b == 0) {
                        System.out.println ("На ноль делить нельзя");
                        s.equals ("1");
                    } else {
                        result = a / b;
                        System.out.println ();
                        System.out.println (a + " / " + b + " = " + result);
                    }
                }
                if (n.equals ("%")) {
                    result = a % b;
                    System.out.println ();
                    System.out.println (a + " % " + b + " = " + result);
                }
                if (n.equals ("^")) {
                    result = Math.pow (a, b);
                    System.out.println ();
                    System.out.println (a + " ^ " + b + " = " + result);
                }

            }
            if (s.equals ("2")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        start ();
    }
}


