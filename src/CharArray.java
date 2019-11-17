import java.util.ArrayList;

public class CharArray {
    public static void main(String[] args) {
        String s1 = "Hello";

//        char[] charArray = new char[s1.length()];
//        charArray[0] = 'H';
//        charArray[1] = 'e';
//        charArray[2] = 'l';
//        charArray[3] = 'l';
//        charArray[4] = '0';

        //instead of using this hardcode, we use  char[] charArray = s1.toCharArray();

        char[] charArray = s1.toCharArray();
        charArray[0] = 'A';
        System.out.println(charArray);
    }
}
