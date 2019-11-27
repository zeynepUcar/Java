public class MyClass {
    int x = 5;
    int y = 5; // or int y;
    int z = 45;

    //final int a = 42; means no more changes for x

    public static void main(String[] args) {
        MyClass c = new MyClass();
        System.out.println(c.x);
        MyClass obj = new MyClass();
        obj.y = 42;
        obj.z = 2;
        c.x =25;

        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println("x " + c.x);
    }
}
