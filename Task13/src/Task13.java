
public class Task13 {
    private static int summ(int[][] mass)
    {
        int summ =0;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                summ += mass[i][j];
            }
        }
        return summ;
    }

    private static double average(int[][] mass)
    {
        double  count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                count++;
            }
        }

        return summ(mass) / count;
    }


    private static int min (int[][] mass)
    {
        int  min = mass[0][0];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if( min > mass[i][j]) {min = mass[i][j];}
            }
        }

        return min;
    }

    private static int max (int[][] mass)
    {
        int  max = mass[0][0];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                if( max < mass[i][j]) {max = mass[i][j];}
            }
        }

        return max;
    }

    private static int NumberOfPositiveElements (int[][] mass)
    {
        int  count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (mass[i][j] > 0) {count++;}
            }
        }
        return count;
    }

    private static void  AmountPerLine (int[][] mass)
    {
        int  summ = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                summ+= mass[i][j];
            }
            System.out.println("line " + (i + 1) + ": " + summ);
            summ = 0;
        }

    }



    public static void main(String[] args) {

        int [][] mass = new int[10][10];

        double d = 0;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
                d = Math.random()*40 - 21;
                mass[i][j] = (int)d;

            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[0].length; j++) {
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


