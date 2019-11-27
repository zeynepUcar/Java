import java.util.HashMap;

public class Task7 {
    // put letters as keys into your HashMap,
    // put value = 0
    public static void main(String[] args) {
        String sentence = "hello";

        //output
        // {h=0,e=0,l=0,o=0}

        HashMap<Character, Integer> myMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
        for(char letter : sentenceArray){
            System.out.println(letter);  // print all letters
        }

        //1.way
//        HashMap<Character, Integer> letterMap = new HashMap<>();
//
//        char[] sentenceArray = sentence.toCharArray();
//        for (char letter : sentenceArray) {
//            letterMap.put(letter, 0);
//        }
//        System.out.println(letterMap);

       //2.way
        for (int i = 0; i < sentence.length(); i++) {
            char aChar = sentence.charAt(i);
            myMap.put(aChar, 0);
        }
        System.out.println(myMap);

    }

}
