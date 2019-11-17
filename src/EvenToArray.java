import java.util.ArrayList;

public class EvenToArray {
    public static void main(String[] args) {
        // Write a java program which will
        // add only even numbers to list from array of integers
        // {100,2,4,5,6,7,8,9,10}
        // [2,4,6,8,10]

        // hint: num%2==0 => this is even

        int[] intArray = {100, 2, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> intList = new ArrayList<>();
        for (int num : intArray) {
            if (num % 2 == 0) {
                intList.add(num);
            }
        }
        System.out.println(intList);



//            int [] a= {2,3,5,6,8,0,12,4,1,9};
//
//            ArrayList<Integer> alist= new ArrayList<>();
//
//            for(int j=0;j<a.length;j++) {
//                if(j%2==0) {
//
//                    alist.add(j);
//                }
//            }
//
//            System.out.println(alist);
        }

    }






