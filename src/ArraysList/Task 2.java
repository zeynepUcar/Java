import java.util.ArrayList;
import java.util.Collections;

public class Task {
    public static void main(String[] args) {
        //1. Write a Java program to create a new array list,
        // add some colors (string) and print out the collection.
        ArrayList<String > arr = new ArrayList<>();
        arr.add("Yellow");
        arr.add("Blue");
        arr.add("Red");
        arr.add("Black");
        arr.add("Beige");
        arr.add("Purple");

        System.out.println(arr);


        //3. Write a Java program to insert an element into the array list at the first position.

        arr.add(1, "pink");
        System.out.println("New one " + arr);

        //2. Write a Java program to iterate through all elements in a array list.

        System.out.println("1. way -----------------------------------");
        //for-each
        for (String color : arr) {
            System.out.println(color);
        }

        System.out.println("2. way -----------------------------------");
        //for-i
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));

        }

        System.out.println("3. way -----------------------------------");
        //.forEach method
        arr.forEach(color -> System.out.println(color));

        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.

        System.out.println("3rd element is " + arr.get(3));

        //5. Write a Java program to update specific array element by given element.

        arr.set(3, "Pink");
        System.out.println("Updated one " + arr);

        //6. Write a Java program to remove the third element from a array list.
        arr.remove(3);
        System.out.println("6th task " + arr);

        //7. Write a Java program to search an element in a array list.
        System.out.println("1. way");
        boolean containsBlack1 = false;
        for (String color : arr) {
            if (color.equals("Black")) {
                containsBlack1 = true;
            }

        }
        if (containsBlack1) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }


        System.out.println("2. way");
        boolean containsBlack2 = arr.contains("Black");
        if (containsBlack2) {
            System.out.println("It has Black color");
        } else {
            System.out.println("It doesn't have Black color");
        }

        //8. Write a Java program to sort a given array list.
        Collections.sort(arr);
        System.out.println(arr);

        //9. Write a Java program to copy one array list into another.



//10. Write a Java program to shuffle elements in a array list.
//
//
//11. Write a Java program to reverse elements in a array list.







    }
}
