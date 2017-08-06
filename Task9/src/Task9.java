import java.util.Scanner;


public class Task9 {
    /*Пользователь вводит координаты верхнего левого и нижнего правого угла прямоугольника,
  а также координаты точки (X,Y) в прямоугольной системе координат.
  Реализовать функцию, которая определяет принадлежит ли точка этому прямоугольнику.*/
    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        int x3;
        int y3;
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите точки координат углов прямоугольника: ");
        System.out.println ("Введите x1:");
        x1 = scanner.nextInt ();
        System.out.println ("Введите y1:");
        y1 = scanner.nextInt ();
        System.out.println ("Введите x2:");
        x2 = scanner.nextInt ();
        System.out.println ("Введите y2:");
        y2 = scanner.nextInt ();
        System.out.println ("Введите координаты точки ");
        System.out.println ("Введите x3:");
        x3 = scanner.nextInt ();
        System.out.println ("Введите y3:");
        y3 = scanner.nextInt ();

        if (x1 < x2 || y1 > y2) {
            if (x3 >= x1 && x3 <= x2 && y3 <= y1 && y3 >= y2) {
                System.out.println ("Точка входит в прямоугольник");
            } else {
                System.out.println ("нет");
            }
        }
        if (x1 > x2 || y1 < y2) {
            if (x3 <= x1 && x3 >= x2 && y3 >= y1 && y3 <= y2) {
                System.out.println ("Точка входит в прямоугольник");
            } else {
                System.out.println ("нет");
            }
        }

    }
}
