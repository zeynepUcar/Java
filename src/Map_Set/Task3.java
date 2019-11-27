import java.util.HashMap;

public class Task3 {
    // Given map, increment map values each time of iteration
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);

        String sentence = "ABC"; //gives us length
        for(char c : sentence.toCharArray()){
            System.out.println(map);
            //write you code here
            int value = map.get("A"); // get"A" gives 0 that means int value = 0
            map.put("A", value + 1); // we are adding 1 each time on loop. otherwaise we will get just 0
            //end of you code
        }
        //output:
        // {"A"=0}
        // {"A"=1}
        // {"A"=2}
    }
}
