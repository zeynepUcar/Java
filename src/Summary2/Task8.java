public class Task8 {
    public static void main(String[] args) {
        // Given an array of ints,
        // print true if it contains no 1's or it contains no 4's.
        // {1, 2, 3} => true
        // {2, 3, 4} => true
        // {1, 2, 4} => false
        //Hint: use boolean variable to hold state

        //1.way
            int[] numbers = {1, 2, 4};
            boolean haveOne = false;
            boolean haveFour = false;

            for (int number : numbers) {
                if (number == 1) {
                    haveOne = true;
                } else if (number == 4) {
                    haveFour = true;
                }
            }

            if (haveOne && haveFour) {
                System.out.println(false);
            } else {
                System.out.println(true);
            }

            //2.Way
        int [] arr1 = {1,2,3};

        boolean check1 = false;

        for (int i : arr1) {
            if (i!=1 || i !=4){
                check1 =true;

            }

        }if (check1){
            System.out.println(true);
        }
        System.out.println("-----------");

        int [] arr2 = {2,3, 4};

        boolean check2 = false;

        for (int i : arr2) {
            if (i==1 || i ==4){
                check2 =true;

            }

        }if (check2){
            System.out.println(true);
        }
        System.out.println("-----------");


        int[] arr3 = {1, 2, 4};

        boolean check3 = false;

        for (int i : arr3) {
            if (i==1 || i == 4){
                check3 =true;

            }

        }if (check3){
            System.out.println(false);
        }


    }
}
