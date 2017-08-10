
public class Task15 {
    public static void main(String[] args) {
        int[][] mass = new int[10][10];

        double d = 0;
        int sum;
        int max_sum = 0;
        int col_max = 0;


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                d = Math.random () * 40 + 1;
                mass[i][j] = (int) d;

            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print (mass[i][j] + " ");

            }
            System.out.println ("");
        }

        for (int j = 0; j < 10; j++) {
            sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += mass[i][j];

                if (max_sum < sum) {
                    max_sum = sum;
                    col_max = j;
                }
            }
            System.out.println ("Column " + j + ": " + sum);
        }
        System.out.println ("The maximum column amount: " + max_sum + " in the column: " + col_max);
    }
}
