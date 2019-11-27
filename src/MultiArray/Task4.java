import java.util.Random;

public class Task4 {
    public static void main(String[] args){
    //TODO Using 2D Array fill the table of exam
// exam is provided with percentages 0-100%
//              JAVA  Math  English
//    Max      ???      ???       ???
//    Bayram  ???      ???       ???

        ///part1. give number
        int[][] examResult = {
                {10, 40, 45},
                {99, 88, 77}
        };
        //part2
        for (int i = 0; i < examResult.length; i++){   // row
            for (int j = 0; j < examResult[i].length; j++){  //column
                System.out.println(examResult[i][j]);
            }
            System.out.println( );

        }
        //part3 assign random numbers

        Random rand = new Random();
        int [][] exam = new int[2][3];

        for (int i = 0; i < exam.length ; i++) {
            for (int j = 0; j < exam[i].length ; j++) {
                exam[i][j] = rand.nextInt(100);
                System.out.println(exam[i][j]);
            }
            System.out.println();


        }



    }
}
