import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskMapEight {
    public static void main(String[] args) {
        //8. Write a Java program to test if a
        //   map contains a mapping for the specified value.
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");


      ///////TOTALLY WRONG SOLUTION/////////// you may use this way with par2

//        String value = "Black";
//        if (map.containsValue(value)){
//            System.out.println("It has black on " + map.get(value));
//        }else {
//            System.out.println("it has not");
//        }


        /////////////////////////////////
        String value = "Black";
        if (map.containsValue(value)){
            System.out.println("It has Black");
        }else {
            System.out.println("it is not working");
        }


        System.out.println("Part2---------------------------------------------");
        //part2, try to check it using loop, without .containsValue method
        //       print key if you have value in map

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer entryKey = entry.getKey();
            String entryValue = entry.getValue();

            if (entryValue.equals("White")) {
                System.out.println("key is:" + entryKey);
            }
        }

        //10. Write a Java program to get the
        //          value of a specified key in a map.
        System.out.println("--------------");

        System.out.println(map.get(3));

        //11. Write a Java program to get a set view of the keys contained in this map.

        System.out.println("__---------------");
//        for (Map.Entry<Integer, String> entry : map.entrySet()) {   // my way right
//            Integer keys = entry.getKey();
//
//            System.out.println("keys is " + keys + " ");
//        }
        System.out.println("all keys in map "  + map.keySet());  // correct way

        HashMap<Character, Boolean> maps = new HashMap<>();
        maps.put('A', true);
        maps.put('B', true);
        maps.put('C', false);

        //print => A B C
        //1.way
        Set<Character> characters = maps.keySet();
        System.out.println(characters);
        // 2.way
        for (Character character : characters) {
            System.out.println(character);
        }


       // 12. to get colection view of the values contained in this map

        // 1.way

        System.out.println("Values are " + map.values());

        //2. way

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value4 = entry.getValue();

            System.out.println("value is " + value4);
        }


    }
}
