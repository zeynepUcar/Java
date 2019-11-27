public class Simple {
    int x = 5;
    int y = 6;

    public static void main(String[] args) {
        Simple ex2 = new Simple();
        System.out.println(ex2.x);
        System.out.println(ex2.y);

        TechnoStudyMethod();

    }

    public void PublicMethod() {
        System.out.println("print something");
    }

    public static void TechnoStudyMethod() {
        System.out.println("print here");
    }
}