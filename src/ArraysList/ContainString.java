import java.util.HashSet;


public class ContainString {
    //14. Write a Java program to check if a string in hash set
    // for ex: ["apple", "red", "green"]
    // if there is red => has red
    // else => dont have it
    public static void main(String[] args) {
        HashSet<String> list1 = new HashSet<>();
        list1.add("apple");
        list1.add("red");
        list1.add("green");

        if (list1.contains("red")){
            System.out.println("it has red");
        }else {
            System.out.println("dont have it");
        }

    }

}
