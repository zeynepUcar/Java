import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraytoList {
    public static void main(String[] args) {
        // Write a Java program to convert an array to ArrayList

//        int[] arr = {1, 23, 34, 45, 34, 645, 6, 45};
//
//        List<Integer> list1 = Arrays.asList(arr); // it is not dynamic, if u add or remove new element, wont print it
//        System.out.println(list1);
        int [] num= {5,90,6,8,5,23,5,6,55};

        ArrayList<Integer> a= new ArrayList<>();

        for(int i=0;i<num.length;i++) {


            a.add(num[i]);
        }
        System.out.println(a);


    }
}
