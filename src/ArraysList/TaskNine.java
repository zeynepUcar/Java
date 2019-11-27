import java.util.ArrayList;

public class TaskNine {
    public static void main(String[] args) {
        //9. Write a Java program to copy one array list into another.

            ArrayList<String> list1 = new ArrayList<>();
            list1.add("Red"); // 0
            list1.add("White");// 1
            list1.add("Black"); // 2
            list1.add("Green");
            System.out.println("List 1: " + list1);

            ArrayList<String> list2 = new ArrayList<>(3);
            // write code here
            System.out.println("HARDCODE");
            String element0 = list1.get(0);
            list2.add(element0);
            list2.add(list1.get(1));

            System.out.println("1. way-------------");
            // Hint: use loop and .get(), .add() methods
            for (String element : list1) {
                list2.add(element);
            }
            System.out.println("List 2: " + list2);
            list1.remove(0); // when we remove item from list1, list2 should not change
            System.out.println("List 2 again: " + list2);

//        System.out.println("\n2. way---------------");
//        for (int i = 0; i < list1.size(); i++) {
//            String element = list1.get(i);
//            list2.add(element);
//        }
//        System.out.println("List 2: " + list2);
//        list1.remove(0); // when we remove item from list1, list2 should not change
//        System.out.println("List 2 again: " + list2);

//        System.out.println("\n3. way---------------");
//        list2 = new ArrayList<>(list1);
            // Collections.copy(list2, list1);

            // System.out.println("\n4. way, bad way, don't do that");
            // list2 = list1;
            // end of code
            System.out.println("List 2: " + list2);
            list1.remove(0); // when we remove item from list1, list2 should not change
            System.out.println("List 2 again: " + list2);


    }
}
