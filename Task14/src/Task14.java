public class Task14 {

    public static void main(String[] args) {

        int[][] mass = new int[5][10];
        int[][] mass1 = new int[1][5];
        int temp;

        double d = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                d = Math.random () * 40 + 1;
                mass[i][j] = (int) d;

            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print (mass[i][j] + " ");

            }
            System.out.println ("");
        }
        //Не совсем удобный но тоже рабочий способ.
        for (int n = 0; n < 1; n++) {
            for (int c = 0; c < 5; c++) {
                for (int j = 0; j < 1; j++) {
                    for (int i = 0; i < 5; i++) {
                        mass1[n][c] = mass[i][0];
                        mass[i][0] = mass[i][1];
                        mass[i][1] = mass1[n][c];
                    }
                }
            }
        }
        System.out.println ();
        System.out.println ("Changed the first two columns in places:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print (mass[i][j] + " ");

            }
            System.out.println ("");
        }
        //меняем местами правельно
        for (int j = 1; j < 2; j++) {
            for (int i = 0; i < 5; i++) {
                temp = mass[i][1];
                mass[i][1] = mass[i][2];
                mass[i][2] = temp;
            }
        }

        System.out.println ();
        System.out.println ("And changed places again:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {

                System.out.print (mass[i][j] + " ");

            }
            System.out.println ("");
        }

    }
}
