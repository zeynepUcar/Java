import java.util.HashMap;

public class Task6 {
    // Put first names and last names into your map, and print
    public static void main(String[] args) {
        String[] firstNames = {"Max", "Drake", "Susan"};
        String[] lastNames = {"Smith", "Jones", "Miller"};
        //write you code here

        HashMap<String, String> map = new HashMap<>();

//        for (int i = 0; i < firstNames.length; i++) {
//            map.put(firstNames[i], lastNames[i]);
//        }

        for (String st : firstNames){

            for (String str : lastNames){
                map.put(st, str);
            }
        }
        System.out.println(map);


        //end of you code
        //System.out.println(map);
        //output:
        //{Max=Smith,Drake=Jones,Susan=Miller}
    }
}
