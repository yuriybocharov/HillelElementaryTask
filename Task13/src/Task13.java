
public class Task13 {
    static int summ(int[][] mass)
    {
        int summ =0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                summ += mass[i][j];
            }
        }
        return summ;
    }

    static double average(int[][] mass)
    {
        double  count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                count++;
            }
        }

        return summ(mass) / count;
    }


    static int min (int[][] mass)
    {
        int  min = mass[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if( min > mass[i][j]) {min = mass[i][j];}
            }
        }

        return min;
    }

    static int max (int[][] mass)
    {
        int  max = mass[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if( max < mass[i][j]) {max = mass[i][j];}
            }
        }

        return max;
    }

    static int NumberOfPositiveElements (int[][] mass)
    {
        int  count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (mass[i][j] > 0) {count++;}
            }
        }
        return count;
    }

    static void  AmountPerLine (int[][] mass)
    {
        int  summ = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                summ+= mass[i][j];
            }
            System.out.println("line " + (i + 1) + ": " + summ);
            summ = 0;
        }

    }



    public static void main(String[] args) {

        int [][] mass = new int[10][10];

        double d = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                d = Math.random()*40 - 21;
                mass[i][j] = (int)d;

            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(mass[i][j] + " ");

            }
            System.out.println("");
        }

        System.out.println ();
        System.out.println("Sum of array elements: " + summ(mass));
        System.out.println("Average: " + average(mass));

        System.out.println("");

        System.out.println("Minimum element: " + min(mass));
        System.out.println("Maximum element: " + max(mass));
        System.out.println("");
        System.out.println("Number of positive elements: " + NumberOfPositiveElements(mass));
        System.out.println ();
        System.out.println ("Amount per line");
        AmountPerLine(mass);

    }
}


