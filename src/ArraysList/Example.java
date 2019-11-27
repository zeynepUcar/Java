import java.util.HashMap;
import java.util.Map;

public class Example {
    //13. calculate sum of items,
    //  size of map should be at least 5
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 300);
        map.put("Strawberry", 400);
        map.put("bLUEBERRY", 500);

        int sum = 0;

        for (Map.Entry<String, Integer>entry : map.entrySet()) {
            int value = entry.getValue(); // or e.getValue()


            sum += value;

        }

        System.out.println("Sum items " + sum);

        //14. print
        // Apple Lemon Peach Melon Berry
        // 100 200 150 145 250
        System.out.println("_______________");
            for (Map.Entry<String, Integer>entry : map.entrySet()) {
                String keys = entry.getKey(); // or e.getValue()
                System.out.println(keys + " ");

            }

             System.out.println();

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    int values = entry.getValue();
                    System.out.print(values + " ");
            }
        System.out.println("-------------");

        //15. given map, print it like this:
        // Apple 100
        // Lemon 200
        // Peach 150
        // Melon 145
        // Berry 250

        for (Map.Entry<String, Integer>entry : map.entrySet()) {
            String keys = entry.getKey(); // or e.getValue()

            int values = entry.getValue();

            System.out.println(keys + " " + values);
        }

    }
}
