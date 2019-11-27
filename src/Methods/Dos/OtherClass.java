public class OtherClass {
    public static void main(String[] args) {
        Example myObj = new Example();
        System.out.println(myObj.x);
    }
}
class Example {

    static int x = 5;
    int y = 42;
    int z = 45;

    public static void main(String[] args) {
        Example ex2 = new Example();
        Example ex3 = new Example();

        System.out.println(ex2.x);
        System.out.println(ex2.y);
        System.out.println(ex2.z);

        System.out.println(ex3.x);

        x = 5;

        TechnoStudyMethod();
//        TechnoStudyMethod2();
    }

    public void PublicMethod() {
        System.out.println("print something");
        x = 5;
        y = 6;
        z = 6;
    }

    public static void TechnoStudyMethod() {
        System.out.println("print here");
        x = 5;
    }
}