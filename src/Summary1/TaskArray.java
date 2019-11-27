package Summary1;

public class TaskArray {
    public static void main(String[] args) {
        // 4. Write a Java program to test if an array contains a specific value

        int[] arr = {1, 23, 34, 45, 34, 645, 6, 45};
        for (int num : arr) { // for-each loop
            if(num == 6){
                System.out.println("I have it");
            }}

        String [] fruit = {"apple", "orange", "grape"};

        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].equals("apple")) {
                System.out.println("it has apple");
            }


        }
    }
}
