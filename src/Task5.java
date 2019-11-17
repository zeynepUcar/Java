import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("orange");
        list.add("grape");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(56);
        list1.add(43);
        list1.add(12);
        list1.add(42);
        System.out.println(list1);
        list1.remove(3);
        System.out.println(list1);
    }
}
