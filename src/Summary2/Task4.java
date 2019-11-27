public class Task4 {
    public static void main(String[] args) {
        //    Write a Java program to find the smallest element in an array.
//    {1,34,66,1000,23,4,7,9} => 1
        int[] number = {1, 34, 66, 1000, 23, 4, 7, 9};

        int min = Integer.MAX_VALUE;

        for (int i : number) {
            if (i < min){
                i= min;
            }
        } System.out.println(min);

        //2.way
//        int a[] = {2, 5, 3, 1, 8};
//        Arrays.sort(a);
//        int min = a[0];
//        System.out.println(min)


    }
}
