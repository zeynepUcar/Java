public class Task6 {
    public static void main(String[] args) {
        // Given an array of ints,
        // print true if it contains no 1's
        int [] num1 = {1, 2, 5, 7, 3, 4};


        for (int i : num1) {
            if (i == 1){
                System.out.println("it has one");
            }
        }

        //print true if it contains no 4's

        int [] num = {1, 2, 5, 7, 3,};

        for (int i : num) {
            if (i != 4){
            }
        } System.out.println(true);

        System.out.println("_____________");

        // print "I have one" outside of loop, if it contains 1's
        // so if you have multiple 1's if should print "I have one" only once
        // {1, 1, 1} =>  "I have one"
        // DON'T USE BREAK
        // Hint: use boolean variable to hold state


        int [] num2 ={1, 3, 5, 1, 7};

        boolean check = false; // if you assign true, it wont goes to if statement, and print true, that means not correct

        for (int i : num2) {
            if (i == 1){
                check = true;
            }

        }if (check = true) {
            System.out.println("i have one");

        }
    }
}
