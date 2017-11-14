import java.util.Arrays;


public class BinarySearch {
    public static int[] mass = new int [30];

    public static void sort(int first, int last) {
        int l = first;
        int r = last;
        int m = mass[(first + last) / 2];

        do {
            while (mass[l] < m) {
                l++;
            }

            while (mass[r] > m) {
                r--;
            }

            if (l <= r) {
                swap(l, r);
                l++;
                r--;
            }
        } while (l < r);

        if (l < last) {
            sort(l, last);
        }

        if (r > first) {
            sort(first, r);
        }
    }

    private static void swap(int l, int r) {
        int tmp = mass[l];
        mass[l] = mass[r];
        mass[r] = tmp;
    }

    public static int BinarySearch(int key, int[] mass) {
        return search(key, mass, 0, mass.length-1);
    }

    private static int search(int key, int[] mass, int min, int max) {
        if (min > max){
            System.out.print ("Такого числа нет ");
            return -1;}

        int point = min + (max - min) / 2;

        if (key < mass[point]) {
            return search(key, mass, min, point - 1);
        } else if (key > mass[point]) {
            return search(key, mass, point + 1, max);
        }
        else {
            System.out.print ("Это число найдено под индексом: ");
            return point;
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < mass.length ; i++) {
            mass [i] = (int) (Math.random () * 100) + 1;
            System.out.print (mass[i] + "; ");

        }
        int first = 0;
        int last = mass.length - 1;
        sort(first, last);

        System.out.println();
        System.out.println ("Отсортировали: ");
        System.out.println(Arrays.toString(mass));
        System.out.println ();
        System.out.println(BinarySearch(47, mass));
    }
}
