public class Farklisi {
    public static void main(String[] args) {
        int [] a = {2, 5, 8,7, 9};
        int [] b = {2, 3, 6, 8, 7, 9};  // for even numbers middle one is on the right side

        int last = a.length ;
        int last1 = b.length;

        if (a[last - 1] == b[last1 -1]){
            System.out.println("last elements are same");
        }

        int half = a.length /2;
        int half1 = b.length /2;

        if (a[half] == b[half1]) {
            System.out.println("middle ones are same");
        }


    }
}
