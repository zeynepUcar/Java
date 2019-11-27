import java.util.HashMap;

public class Task8 {
    // put only 'h' letter as keys into your HashMap,
    // put value = 0
    public static void main(String[] args) {
        String sentence = "hello";

        HashMap<Character, Integer> s = new HashMap<>();

        char[] ch= sentence.toCharArray();

        for(char c:ch) {

            if(c=='h')
            {
                s.put(c,0);
            }
        }
        System.out.println(s);


    }
}
