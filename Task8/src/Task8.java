import java.util.Scanner;

public class Task8 {
    //Реализовать функцию по нахождению сумм цифр в числе без использования класса String или массивов типа char
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Введите число");

        int num = scanner.nextInt ();
        int num1 = num % 10;
        System.out.println (num1);
        int num2 = (num % 100) / 10;
        System.out.println (num2);
        int num3 = (num % 1000) / 100;
        System.out.println (num3);


        int result = num3 + num2 + num1;

        System.out.println ("Сумма цифр числа: " + num + " равна " + result);
    }
}
