import java.util.ArrayList;

public class Task3 {
    // Write a program with a method named printAverage
    // that accepts ArrayList of integers as an argument and print its average.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(10);
        list.add(5);
        printAverage(list); //list is our argument

    }
    public static void printAverage(ArrayList<Integer> numbers){
        int sum = 0;                  //parameters

        for (Integer number : numbers) {
            sum += number;


        }
        double ave = (double)sum / numbers.size();
        System.out.println(ave);



    }
}
