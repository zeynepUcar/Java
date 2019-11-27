import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyPets {
    public static void main(String[] args) {
        // ArrayList<Integer>list = new ArrayList<>(); // this object is already in java

        Animal tiger = new Animal();
        tiger.legs = 4;
        tiger.age = 5;
        tiger.weight = 200.00;
        tiger.name = "Richard Parker";
        tiger.poisonous =false;
        tiger.breed = "Bangal";

        tiger.cuteness();
        int speed = tiger.getSpeed();
        System.out.println("speed " + speed);
        System.out.println("Can my tiger jump?: " + tiger.canJump());

        String output = tiger.toString();

        System.out.println("----------------------------------");
        System.out.println(output);

    }
}
