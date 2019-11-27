import java.util.ArrayList;
import java.util.HashSet;

public class Task9 {
    public static void main(String[] args) {
        // Given arrayList of chars
        // print true if they have repetitive letters
        // {'A','B','B'} => true
        // {'C','D'} => false


          //1.WAY
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('B');
        boolean rep = false;

        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < list.size(); i1++) {
                if (list.get(i) == list.get(i1)){
                    rep = true;
                }
            }

        }if (rep){
            System.out.println(true);
        }else{
            System.out.println("nothing");
        }

        //2.WAY

        HashSet<Character>set = new HashSet<>();
        for (Character character : list) {
            set.add(character);

        }
        System.out.println(set);
        System.out.println(list);

        if (set.size() != list.size()){
            System.out.println(true + " there is duplication");
        }



    }
}
