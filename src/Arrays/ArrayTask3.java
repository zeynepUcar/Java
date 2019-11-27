// you have string array of numbers,
// change data type to int
//ex: {"11", "13", "17"} =>  {11, 13, 17}

import java.util.Arrays;

public class ArrayTask3 {
    public static void main(String[] args) {
        String[] strArray = new String[15];
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = "" + i;
            // stringNumbers[0] = "0"
            // stringNumbers[1] = "1"
            // ...
            // stringNumbers[14] = "14"
        }
        String stringSum = "";
        for (String a : strArray) {
            stringSum += a;
        }
        System.out.println("StringConcatenate: " + stringSum);

        int[] intArray = new int[15];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(strArray[i]);
        }

        int intSum = 0;
        for (int n : intArray) {
            intSum += n;
        }
        System.out.println("IntSum: " + intSum);



    }
}
