package Summary1;

public class PrintingZeros {
    public static void main(String[] args) {
        //    Write a Java program to print the grid of zeros with length m and n.
        int m=100;
        int n=10;

        int[][] mn= new int[m][n];



        for(int i=0;i<mn.length;i++) { // i < m
            for (int j = 0; j < mn[i].length; j++) { // i < n

                System.out.print(mn[i][j]); //we will got zeros, bec we did not initilize there


            }
            System.out.println();
        }
    }
}
