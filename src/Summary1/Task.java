package Summary1;

public class Task {
    public static void main(String[] args) {
        // 2. Write a Java program to sum values of an array.
        int[] numbers = {1, 2, 4, 10, 2, 0};
        int sum = 0;
//        for (int number : numbers) {
//            sum += number;
//        }
//        System.out.println(sum);

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }  System.out.println("2.way " + sum);

    }
}
