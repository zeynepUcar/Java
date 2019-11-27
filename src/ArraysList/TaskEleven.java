import java.util.ArrayList;
import java.util.Collections;

public class TaskEleven {
    // 11. Write a Java program to reverse elements in a array list.
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red"); // 0
        list1.add("White");// 1
        list1.add("Black"); // 2
        list1.add("Green");
        System.out.println("List 1: " + list1);
         System.out.println("1. way--------------");
         Collections.reverse(list1);

        System.out.println("2. way--------------");
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = list1.size() - 1; i >= 0; i--) {
            String element = list1.get(i);

            list2.add(element);
        }list1 = list2;


        // end code
        System.out.println("List 1 reverse : " + list1);

    }
}
