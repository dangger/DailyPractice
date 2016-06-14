/*
 * Input:3 / * 2
 * Output:/ * 2 / 2 * * / 2 * 2 / 2 * / 2 / *
 * */

import java.util.Scanner;

public class Perm {

    public static void perm (Object[] array, int left, int right) {
        if (left == right) {
            for (int i = 0; i <= right; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            for (int i = left; i <= right; i++) {
                swap(array, left, i);
                perm(array, left + 1, right);
                swap(array, left, i);
            }
        }
    }

    public static void swap(Object[] array, int left, int right) {
        Object t;
        t = array[left];
        array[left] = array[right];
        array[right] = t;
    }

    public static void main(String[] args) {
        String[] array = new String[100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }
        perm(array, 0, n - 1);
    }
}
