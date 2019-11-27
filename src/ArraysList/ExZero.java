import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;

public class ExZero {
    //17. Given map, update the values
    // Apple 333
    // Lemon 444
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);

        map.put("Lemon", 444);
        map.put("Apple", 333);
        System.out.println(map);

        //part2. suppose you have large map, and you need to check
        // if you have "Apple" there, if you have apple, only then change
        // its value to 500
        // Hint: .contains methods

        if(map.containsKey("Apple")) {
            map.put("Apple",500);        }
        System.out.println(map );

    }
}
