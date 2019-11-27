import java.util.Random;
//TODO Task
// part1. fill array with random values
// part4. print it in reverse order
public class ArrayTask1Half {
    public static void main(String[] args) {

        Random rand = new Random();

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) { // i = is for index

            arr[i] = rand.nextInt(15);
            System.out.println(arr[i]);

            // part2. check if an array of has 0, print => "it has zero" also checking index
            if (arr[i] == 0){
                System.out.println("it is zero " + "index is " + i ); // add i foe find which index has 0
            }

            // part3. check if array has 10, print => "it has 10" also checking index
            if ( arr[i] == 10){
                System.out.println("it is ten " + "index is " + i);
            }


        }
        //part4. reverse
        for (int i = arr.length -1; i >= 0;i--){
            System.out.println(" " + arr[i]);
        }
    }
}
