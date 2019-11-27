import java.util.HashMap;

public class MapTask {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        //4. Write a Java program to remove all
        //   of the mappings from a map.
        //  map.clear();

        //ex: do we have key 3, print => Black,
        //                 else print => No we don't have

        int key = 3;
        if (map.containsKey(key)){
            System.out.println("value is " + map.get(key));
        }else {
            System.out.println("no we dont have");
        }
        //5. check if your map is empty

        if (map.isEmpty()){
            System.out.println("it is empty");
        }else {
            System.out.println("it is not empty");
        }


    }
}
