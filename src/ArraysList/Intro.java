import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        ArrayList<String> alist=new ArrayList<>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");

        //displaying elements
        System.out.println(alist);

        alist.add(3, "Zeynep");

        System.out.println(alist);

        alist.remove(0);
        System.out.println(alist);
    }
}
