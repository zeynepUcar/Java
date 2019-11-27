import java.net.PortUnreachableException;

public class JavaMethodWithReturn {
    public static void main(String[] args) {
        int sum = sumOfThree(10,20,30);
        System.out.println("sum of three is " + sum);

        double average = avg(sum, 3);
        System.out.println("average is " + average);

       // giveMeLetter("Techno", 0); or like below
        System.out.println(giveMeLetter("Techno", 0));

    }
    public  static  double avg(int sum, int size){
      double average = (double)sum/ size;
      return average;
    }
    public static int sumOfThree(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    // return for void methods
    public static void buyStuffFromStore() {
        boolean dontHaveMilk = true;
        if (dontHaveMilk) {
            System.out.println("I'll to go to other store");
            return;
        }

        System.out.println("buy milk");
        System.out.println("buy bread");
        System.out.println("buy water");
    }

    public static Character giveMeLetter(String text, int index){

        return text.charAt(0);
    }



}
