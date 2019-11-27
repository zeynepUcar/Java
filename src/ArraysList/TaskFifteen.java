import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class TaskFifteen {
    //15. Populate you hash set with random number
    //    you hash set size must be 100
    public static void main(String[] args) {
        // Hint:
        // 1. create set
        // 2. iterate 100 times
        // 3. add number to set
        Random rand = new Random();

        HashSet<Integer> mySet = new HashSet<>();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int randomNumber = rand.nextInt(5); // 0 1 2 3 4

            mySet.add(randomNumber);
            myList.add(randomNumber);
        }

        System.out.println("myList: " + myList);
        System.out.println("mySet: " + mySet); // does not accept duplication

    }

}
