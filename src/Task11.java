public class Task11 {
    public static void main(String[] args) {
        // write a java program that print array in this manner
        // using while loop
        //part1:
//            1 10
//            2 9
//            3 8
//            4 7
//            5 6
//            6 5
//            7 4
//            8 3
//            9 2
//            10 1
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int first = 0;
        int second = 9;
        while (first<10){
            System.out.println(arr[first] + " " + arr[second]);
            first++;
            second--;
        }

        //part2:
        //  1 10
        //  2 9
        //  3 8
        //  4 7
        //  5 6

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int a = num.length;

        int i = 0;
        while (i < a/2){

            System.out.println(num[i] + " " + num[(a-1)-i] + " ");
            i++;
        }
        System.out.println();


    }
}
