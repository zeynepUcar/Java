public class NestedLoopSample {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println("category: " + i); // Automative & Wheel
            for (int j = 0; j < 5; j++) {
                System.out.println("item: " + j + " of category: " + i); // Wheel
                for (int k = 0; k < 3; k++) {
                    System.out.println("detail: " + k + " of item: " + j); // General Grabber AT2 Radial
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
