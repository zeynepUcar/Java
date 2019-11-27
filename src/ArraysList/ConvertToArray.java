import java.sql.Array;
import java.util.HashSet;

public class ConvertToArray {
    //7. Write a Java program to convert a hash set to an array.
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);

        Integer[] array = new Integer[numbers.size()];
        numbers.toArray(array);
        System.out.println("New ARRAYS ELENMENTS ");


        for (Integer elements : array) {
            System.out.println(elements);

        }
    }
}
