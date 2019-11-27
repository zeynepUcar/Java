public class Office {

    int age = 20;

    static int age2 = 20;

    public void myMethod1() {

        int carAge = 23;
        System.out.println("car age in myMethod1  --------  " + carAge);
    }

    public void myMethod2(){
        System.out.println("age in myMethod2  -------  " + age);
        System.out.println("age in myMethod2  -------  " + age++);
       // System.out.println(carAge); // this variable is local veriable in myMethod1, wecant reach bc is non static

        System.out.println("age2 in myMethod1  --------  " + age2);
        System.out.println("age2 in myMethod1  --------  " + age2++);

    }
    public static void myMethod3(){
        Office s1 = new Office();
        s1.myMethod2();
        System.out.println(age2);

    }

    public static void main(String[] args) {

       // System.out.println(age); // calling age it should be static to call back, so cant even run it

        //after i creating object with class name, i can recall age
        Office s1 = new Office();
        s1.myMethod2();
        s1.myMethod1();

        Office s2 = new Office();  //3 diff object, everytime static variable will be increased bc of ++
        s2.myMethod2();            // static variable takes value from previous object

        Office s3 = new Office();
        s3.myMethod2();

        myMethod3(); // do not need to create abject, it is already static








    }

}
