public class Task7 {
    public static void main(String[] args) {
        // Given an array of ints,
        // print "true" outside of loop, if it does not contains 4
        // {4, 1, 1} => false

        // DON'T USE BREAK
        // Hint: use boolean variable to hold state

        int [] num ={4, 1, 1};

        boolean check = false;

        for (int i : num) {
            if (i == 4){
                check = true;
            }

        }
        if (check) {
            System.out.println();


        }

        System.out.println("------------------");
        // {1, 2, 3} => true

        int [] num2 = {1, 2, 3};
        boolean check2 = false;
        for (int i : num2) {
            if (i == 4){
                check2= false;  // it assigns check

            }

        }if (check2){

        }System.out.println(check2);
    }
}
