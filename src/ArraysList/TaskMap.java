import java.util.HashMap;
import java.util.Map;

public class TaskMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
         map.put((1), 10);
         map.put((2), 20);
         map.put((3), 30);
         map.put((4), 40);
         map.put((5), 50);

        //2. Write a Java program to count the number
        //  of key-value (size) mappings in a map.

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer point = entry.getValue();
            System.out.println(key + " " + point);
        }
        //3. Write a Java program to copy all of the
        //   mappings from the specified map to another map.

//        HashMap<Integer, Integer> copymap1 = new HashMap<>(map);
//        System.out.println("copied one " + copymap1);

        //1. WAY

        //HashMap<Integer, Integer> copymap1 = new HashMap<>(map);

        //2.WAY
        //HashMap<Integer, Integer> copymap1 = new HashMap<>();

        //copymap1.putAll(map);

        //3.WAY
        HashMap<Integer, Integer> copymap1 = new HashMap<>();

        for (Map.Entry<Integer, Integer>entry : map.entrySet()){
            Integer key = entry.getKey();
            Integer point = entry.getValue();
            copymap1.put(key, point);
        }System.out.println("copied one " + copymap1);







    }
}
