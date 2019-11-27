public class MyPuppy {
    public static void main(String[] args) {


        Animal puppy = new Animal();
        puppy.legs = 4;
        puppy.age = 1;
        puppy.weight = 15.00;
        puppy.name = "Peanut";
        puppy.poisonous = false;

       // puppy.cuteness = // cant write like that

        puppy.cuteness();
        System.out.println(puppy.getSpeed());




    }
}
