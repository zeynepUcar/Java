//Task 1. write a for loop that finds an maximum for the array
//Task 2. write a for loop that finds an minimum for the array
//Task 3. write a for loop that finds an average for the array
// int[] myArray = {34,5,6,2,3,78,1}
//OUTPUT: average: (34+5+6+2+3+78+1)/7
public class Homework {
    public static void main(String[] args) {
        int[] myArray = {34,5,6,2,3,78,1};

        int min = myArray[0];            //int min = Integer.MAX_VALUE
        int max = myArray[0];        //int max = Integer.MIN_VALUE  IF WE HAVE NEGATIVE NUMBER INSIDE
        double sum = 0;

        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];

            if (myArray[i] > max) {
                max = myArray[i];
            }
            if (myArray[i] < min) {
                min = myArray[i];
            }


        }
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
        System.out.println("Sum is " + sum);
        System.out.println("Average is  " + sum / myArray.length);


    }
}
