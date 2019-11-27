public class Person {
    String fname = "Techno";
    String lname = "Study";
    int age =6;

    public static void main(String[] args) {
        Person obj = new Person();


        System.out.println(obj.fname);
        System.out.println(obj.lname);
        System.out.println(obj.age);
        System.out.println("Name : " + obj.fname + " " + obj.lname);
    }
}

