public class HwMethod2 {
    //    5. Write a Java method to count all words in a string. Go to the editor
//    Test Data:
//    Input the string: The quick brown fox jumps over the lazy dog.
//    Expected Output:
//
//    Number of words in the string: 9
    //advanced, put in a new class and call the method from the class.
    public static void main(String[] args) {


        int result = 0;

        result = Sentence("The quick brown fox jumps over the lazy dog");

        System.out.println(result);
    }
    //just count the spaces between the words and add 1 and get the numbers of words


    public static int Sentence(String name) {
        int count = 0;

        char space = ' ';

        for (int a = 0; a < name.length(); a++) {
            if (name.charAt(a) == space) {
                count = count + 1;


            }


        }

        return count + 1;
    }
}