import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Taskk {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a hash set.

        System.out.println("ArrayList------------------------");
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        System.out.println(listNumbers);

        System.out.println("HashSet------------------------");
        Set<Integer> setNumbers = new java.util.HashSet<>();
        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(3);
        setNumbers.add(10);

        // part2 add number 5, five times
        setNumbers.add(5);
        setNumbers.add(5);
        setNumbers.add(5);
        setNumbers.add(5);
        setNumbers.add(5);
        System.out.println(setNumbers);
//Write a Java program to iterate through all elements in a hash list.
        //1st way
        for (Integer setNumber : setNumbers) {
            System.out.println(setNumber);

        }
        System.out.println("\n2. way ------------------------------");
        Iterator<Integer> iterator = setNumbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
        //3. Write a Java program to get the number of elements in a hash set.
        System.out.println("size is " + setNumbers.size());

        //4. Write a Java program to empty an hash set.
//        setNumbers.clear();
//        System.out.println(setNumbers);


//        System.out.println("HashSet------------------------");
//        Set<Integer> setNumbers = new java.util.HashSet<>();
//        setNumbers.add(1);
//        setNumbers.add(2);
//        setNumbers.add(3);
//        setNumbers.add(10);
//
//   TODO     // part2 add number 5, five times
//        setNumbers.add(5);
//        setNumbers.add(5);
//        setNumbers.add(5);
//        setNumbers.add(5);
//        setNumbers.add(5);
//        System.out.println(setNumbers);
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);

        setNumbers.removeAll(set2);
        System.out.println("after remove 1 and 2 " + setNumbers);


        //test a has set is empty or not

        System.out.println(setNumbers.isEmpty());
        //5. Write a Java program to test a hash set is empty or not.
        if (setNumbers.isEmpty()){
            System.out.println("print empty");
        }else {
            System.out.println(setNumbers);
        }




    }

}
