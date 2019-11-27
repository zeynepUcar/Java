package Summary1;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[]array = {1, 5, 3, 10, 33, 100};
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();

        Arrays.sort(array);
        for (int n : array) {
            System.out.println(n + " ");

        }
    }
}
