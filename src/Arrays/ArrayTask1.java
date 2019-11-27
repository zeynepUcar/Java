import java.util.Random;

//TODO Task
// part1. fill array with random values using Random/Math.random, 10 < array.length < 100
// part2. find average or array;
//  ex: [1, 5, 6, 8] => 20/4 => 5
public class ArrayTask1 {
    public static void main(String[] args) {
//        Random rand=new Random();               you may write like that, too
//        int[] numbers = new int[20];
//
//        for(int i = 0; i< numbers.length; i++)
//        {
//            numbers[i] = 1 + (int) (Math.random() * (100));
//        }
//        System.out.println(numbers.length);

        int arr [] = new int[100];
        int sum = 0;

        for (int i = 10; i < arr.length; i++){   //arr.fori is shortcut
                  // does not need to be 10, my use 0

            arr[i] = (int)(Math.random()*100);   //arr[i] = rand.nextInt(100) much readable
            sum += arr[i]; // it needs to be there, if i put before random numbers, wont print sum

            System.out.println(arr[i]);


        }
        System.out.println(sum);
        System.out.println("average " + sum/arr.length);




    }

}
