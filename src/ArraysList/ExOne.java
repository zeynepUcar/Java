import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ExOne {
    //Count letters in the string
// " BECOME A SOFTWARE TESTER IN 6 MONTHS"}
    public static void main(String[] args) {
        String sentence = "BECOME A SOFTWARE TESTER IN 6 MONTHS";

        //part 1
        // print every character in separate line

        for (int i = 0; i <sentence.length() ; i++) {
            System.out.println(sentence.charAt(i));
        }
        System.out.println("2.way--------------");
        //part2
        // put every character in HashSet

        HashSet<Character> mySet = new HashSet<>();
        char[] c = sentence.toCharArray();

        for (int i = 0; i < c.length; i++) {
            mySet.add(c[i]);
        }
        System.out.println(mySet);
        //DOS
//        HashSet<Character> mySet = new HashSet<>();
//        for (int i = 0; i < sentence.length(); i++) {
//            char aChar = sentence.charAt(i);
//            mySet.add(aChar);
//        }
//        System.out.println(mySet);

        //part3
        // put every character in HashMap<Character, Integer>

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            char aChar = sentence.charAt(i);
            map.put(aChar,0);
        }
        System.out.println(map);



        //part4
        // when you are putting check if you have that letter already, if you have, increment value

        //part5
        //print HashMap







    }
}