import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        String[] names = {"Max", " Drake", "Susan"};
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : names){
            map.put(str, 0);

        } System.out.print(map);


    }
}
