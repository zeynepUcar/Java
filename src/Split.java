public class Split {
    public static void main(String[] args) {
        String s1 = "Hello world today is saturday";
        String[] array = s1.split(" ");
        for (String s : array) {   // loop provides to get all words each by each
            System.out.println(s);

        }
        // System.out.println(array[5]); if we right like this we wont get all words, just one of them
    }
}
