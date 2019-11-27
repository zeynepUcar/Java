public class Task3 {
    public static void main(String[] args) {
        //    Write a Java program to find the largest element in an array.

        int[] number = {1, 34, 66, 1000, 23, 4, 7, 9};

        int max = Integer.MIN_VALUE;

        for (int i : number) {
            if (i > max) {
                max = i;


            }

        } System.out.println("maximum is " + max);
    }
}
