public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //fills 1.row 5 times then another line
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("\n--------------");
        }
    }
}

//rows and columns
//*****
//*****
//*****
//*****
//*****

