import java.util.ArrayList;
import java.util.Arrays;


public class SortingTask {
    public static void main(String[] args) {
        //Write a Java program to sort a numeric array and a string array.

        int[] numbers = {1, 2, 4, 10, 2, 0};
        System.out.println("before sorting " + Arrays.toString(numbers));
        Arrays.sort(numbers);  //provides sorting
        System.out.println("after sorting " + Arrays.toString(numbers));

  //      Arrays.sort(numbers);
//        for (int number : numbers) {
//            System.out.println("after sorting " + number);
//
//        }
        String[] names = {"Zeynep", "Serkan", "Bayram"};
        System.out.println("before sorting " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.print("after sorting " +  Arrays.toString(names) );

       // Arrays.sort(names);
//        for (String name : names) {
//            System.out.print("after sorting " + name );
//
//        }


    }


}
