public class Task2 {
    public static void main(String[] args) {
        //using loop print multiplication table of 1
        //output:
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // part1:
        for (int i = 1; i <= 10; i++) {
            System.out.println("1 * " + i + " = " + i );
        }
        // part2:
        int a = 2;
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " x " + b + " = " + (a * b));
        }
        System.out.println();
        //part1.3 print multiplication of table 1,2,3,4,5,6,7,8,9,10
        for (int x = 1; x <= 10; x++){
            for (int y = 1; y <= 10; y++){
                System.out.println( x + " * " + y + " = " + (x*y) );
            }System.out.println("-----------------");

        }



    }
}

