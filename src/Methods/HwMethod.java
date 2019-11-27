import java.util.Scanner;
//    5. Write a Java method to count all words in a string. Go to the editor
//    Test Data:
//    Input the string: The quick brown fox jumps over the lazy dog.
//    Expected Output:
//
//    Number of words in the string: 9
//advanced, put in a new class and call the method from the class.
public class HwMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the string :");
        String str = in.nextLine();
        System.out.println("number of words in the string:" + wordcount(str));
    }

    public static int wordcount(String sentence) {
        int count = 0;
        char ch[] = new char[sentence.length()];
        for (int i = 0; i < sentence.length(); i++) {

            Character letterChar = sentence.charAt(i); // give us character one by one

            ch[i] = sentence.charAt(i);

            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        return count;
    }
}
//    String sentence="The quick brown fox jumps over the lazy dog.";
//    String[] word = sentence.split(" ");
//        System.out.println("Number of words in the string:   "+word.length);