import java.util.ArrayList;
import java.util.HashSet;

public class TaskSixteen {
    //16. you have list of numbers, determine if you have duplication there
    //ex: [1, 2, 3, 4, 4, 5, 6]  => has duplications
    //ex2: [1, 2, 3] => no duplications
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);
        System.out.println(list.size());


        System.out.println("1. Way-----------------");


        HashSet<Integer> mySet = new HashSet<>(list);

        System.out.println(mySet + " size:" + mySet.size());

        if (list.size() != mySet.size()) {
            System.out.println("has duplications");
        } else {
            System.out.println("no duplications");
        }

        System.out.println("2. way");
//        HashSet<Integer> mySet = new HashSet<>();
//        for (Integer number : list) {
//            if(mySet.contains(number)){
//                System.out.println("Set already has this number: " + number);
//                break;
//            }else {
//                mySet.add(number);
    }
}
