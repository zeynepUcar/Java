import java.util.ArrayList;

public class Task4 {
    // Write a program with a method named getSum
    // that accepts ArrayList of integers as an argument and print its sum in main.
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(4);
        mylist.add(90);
        mylist.add(10);
        mylist.add(5);

        int sum = getSum(mylist);
        System.out.println(sum);
    }

    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        return sum;
    }
}