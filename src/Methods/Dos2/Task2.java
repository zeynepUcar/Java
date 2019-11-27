import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;

public class Task2 {
    // Write a program with a method named printSum
    // that accepts ArrayList of integers as an argument and print its sum.
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(90);
        list.add(10);
        list.add(5);

        sumList(list); // for calling method
    }
    public static void sumList(ArrayList<Integer>numbers){   //method
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;

        } System.out.println("sum is " + sum);

    }
}
