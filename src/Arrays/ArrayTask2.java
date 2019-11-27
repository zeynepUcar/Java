import java.util.Scanner;

//TODO
//part1. using scanner fill array of length 10;
//part2. print reverse of you array
// 1 2 3 4 5 6 7 8 9 10
// 10 9 8 7 6 5 4 3 2 1
public class ArrayTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr [] = new int[10];

        for (int i = 0; i < arr.length; i++){
            System.out.println("provide the elements");
            arr[i] = scan.nextInt();
        }
        //HINT Part2:
        // start from length()-1
        // use i-- to decrement
        for ( int i = arr.length -1 ; i >= 0; i-- ){        // reverse provides us index of array
            System.out.println(i);                           //index starts 0 goes to arr.length-1
        }


    }
}
