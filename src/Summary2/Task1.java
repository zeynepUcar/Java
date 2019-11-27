public class Task1 {
    public static void main(String[] args) {
        // write a java program that find maximum
        // of two numbers

        int a = 6;
        int b = 10;

        //1.WAY

        if (a< b){
            System.out.println("b is bigger than " + "a");
        }else {
            System.out.println("a is bigger than " + "b");
        }

        //2.WAY
        int max =  Math.max(a,b);

        System.out.println("maximum number is " + max);

        //3. way
        int max2 = (a >= b) ? a : b;
        System.out.println("Max2 is:" + max2);


    }
}
