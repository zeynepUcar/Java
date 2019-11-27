package Summary1;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        //    Write a Java program to sort in reverse order a numeric array

        List<String> names = Arrays.asList( "Betul", "Zeynep", "Asim");
        Collections.sort(names);
        System.out.println(names);

        for (int i = names.size() - 1; i >= 0; i--) {
            String nm = names.get(i);
            System.out.print(nm + " ");
        }






    }
}
