public class DevamMulti {
    public static void main(String[] args) {
        // 1. write program that prints this using loops
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        System.out.println("USING LOOPS ----------------------");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j <= i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        for (int i = 0; i <= 5; i++){
//            for (int k = 0; k <= i; k++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //2. write program that prints this figures using loops
        //        *
        //       **
        //      ***
        //     ****
        //    *****
        System.out.println("---------------");

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //      *****
        //       ****
        //        ***
        //         **
        //          *
        System.out.println("---------------");

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= 0; j--) {
                if (j <= i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }

    }

