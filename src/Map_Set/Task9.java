import java.util.HashMap;

public class Task9 {
    // put letters in your map, value = 0
    // if map contains that letter already print => "I have it"
    public static void main(String[] args) {
        String sentence = "hello";

        HashMap<Character, Integer> letterMap = new HashMap<>();
        char[] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {

            if (letterMap.containsKey(letter)) {  // onceki adimda letter l e sahip olacak, ve bu adima gelince evet var deyip yazdiracak
                System.out.println("i have it");
            } else {
                letterMap.put(letter, 0);
            }

            System.out.println(letterMap);

        }


        }
}
