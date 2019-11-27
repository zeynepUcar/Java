public class Task2 {
    public static void main(String[] args) {
        // write a java program that find maximum
        // of three numbers
        int a = 56;
        int b = 78;
        int c = 32;

        if (a >= b && a >= c){ // = provide not check unnecassary check and faster
            System.out.println("Maximum is " + "a");
        }else if (b >= a && b >= c ){
            System.out.println("Maximum is " + "b");
        }else {
            System.out.println("Maximum is " + "c");
        }
    }
}
