import java.util.Scanner;

public class Task4 {
    //Рисуем фигуры
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите a");
        int a = scanner.nextInt ();
        System.out.println ("Введите b");
        int b = scanner.nextInt ();

        // рисуем прямоугольник
        String[][] str = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                str[i][j] = "* ";
            }
        }
        for (int i = 1; i < a - 1; i++) {
            for (int j = 1; j < b - 1; j++) {
                str[i][j] = "  ";
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print (str[i][j]);
            }
            System.out.println ();
        }
        //рисунок в шахматном порядке
        String[][] str1 = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                str1[i][j] = "* ";
            }
        }
        for (int i = 0; i < a; i += 2) {
            for (int j = 0; j < b; j++) {
                str1[i][j] = " *";
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print (str1[i][j]);
            }
            System.out.println ();
        }
        //Конверт
        String[][] str2 = new String[a][a];
        for (int i = 0; i < str2.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                str2[i][j] = "*";
            }
        }
        for (int i = 1; i < str2.length - 1; i++) {
            for (int j = 1; j < str2.length - 1; j++) {
                str2[i][j] = " ";
            }
        }
        for (int i = 1; i < str2.length - 1; i++) {
            for (int j = 1; j < str2.length; j++) {
                str2[i][j] = "*";
                if (str2[i++][j] == "*") {
                }
            }
        }
        for (int i = 1; i < str2.length - 1; i++) {
            for (int j = 1; j < str2.length; j++) {
                str2[i][str2.length - j - 1] = "*";
                if (str2[i++][str2.length - j - 1] == "*") {

                }
            }

        }
        for (int i = 0; i < str2.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                System.out.print (str2[i][j]);
            }
            System.out.println ();
        }
        // Еще один вариант конверта
        String[][] str3 = new String[a][a];


        for (int i = 0; i < str3.length; i++) {
            for (int j = 0; j < str3.length; j++) {
                str3[i][j] = " ";
            }

        }

        for (int i = 0; i < str3.length; i++) {
            for (int j = 0; j < str3.length; j++) {
                if (i == 0) {
                    str3[i][j] = "*";
                }
                if (i == str3.length - 1) {
                    str3[i][j] = "*";
                }
                if (j == 0 || j == str3.length - 1) {
                    str3[i][j] = "*";
                }
                if (j == i || j == i - str3.length - 1) {
                    str3[i][j] = "*";
                }
                if (j == str3.length - i - 1 || j == i) {
                    str3[i][j] = "*";
                }

            }
        }

        for (int i = 0; i < str3.length; i++) {
            for (int j = 0; j < str3.length; j++) {
                System.out.print (str3[i][j]);
            }
            System.out.println ("");
        }
    }
}
