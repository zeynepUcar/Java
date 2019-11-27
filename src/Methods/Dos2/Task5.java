public class Task5 {
    //Write a boolean method called isOdd()
    // which takes an int as input and returns true if the it is odd.
    public static void main(String[] args) {
       boolean boo = isOdd(5);
        System.out.println(boo);
    }
    public static boolean isOdd(int a) {
        boolean haveOdd = false;
        if (a % 2 != 0) {
            haveOdd = true;
        }else{
            haveOdd = false;
        }return haveOdd;
    }
}
