// Задание 15
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Seasons {

    public static int year = 0;
    public static String month;
    public enum Month {January, February, March, April, May, June, July, August, September, October, November, December}


    public static void menu() {
        System.out.println ("Меню:");
        System.out.println ("1. Введите месяц");
        System.out.println ("2. Сменить год");
        System.out.println ("3. Выход");
        System.out.println ();
        System.out.println ("Для выбора введите цифру:");

    }

    public static void main (String[] args) throws IOException {

        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));


        int i = 0;

        System.out.println ("Для дальнейшей работы необходимо установить год");
        System.out.println ();
        System.out.println ("Введите год:");

        year = Integer.parseInt (reader.readLine ());



        while (true) {
            menu ();

            i = Integer.parseInt (reader.readLine ());


            if (i == 1) {
                System.out.println ("Смена месяца");
                month = (reader.readLine ());
            }

            if (i == 2) {
                System.out.println ("Введите новый год: ");
                year = Integer.parseInt (reader.readLine ());

            }

            if (i == 3) {
                System.out.println ("Досвидания");
                break;
            }


            if (month.equals (Month.January.toString ())|| month.equals (Month.March.toString ())
                    || month.equals (Month.May.toString ()) ||month.equals (Month.July.toString ())
                    || month.equals (Month.August.toString ())||month.equals (Month.October.toString ())
                    || month.equals (Month.December.toString ())) {
                System.out.println ("31 Day");
                System.out.println ();
            }
            if (month.equals (Month.April.toString ())|| month.equals (Month.June.toString ())
                    || month.equals (Month.September.toString ()) ||month.equals (Month.November.toString ())) {
                System.out.println ("30 Day");
                System.out.println ();
            }
            if (month.equals (Month.February.toString ())) {
                if

                        (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    System.out.println ("29 Day");
                    System.out.println ();
                }
                else
                    System.out.println ("28 Day");
                System.out.println ();


            }




        }

    }

}

