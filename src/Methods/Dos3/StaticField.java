class Car{
    public static int count = 0;  // every method can access bc of static

    public String name;
}


public class StaticField {
    public static void main(String[] args) {
        Car bmw = new Car();

        bmw.count++;

        System.out.println(bmw.count);

        bmw.count++;

        System.out.println(bmw.count); // it prints according to previous value

        Car car1 = new Car();
        car1.name = "bwm";
        car1.count++;
        System.out.println("Car1 name: " + car1.name);
        System.out.println("Car1 count: " + car1.count);

        Car car2 = new Car();
        car2.name = "toyota";
        car2.count++;
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car2 count: " + car2.count);


        Car car3 = new Car();
//        car3.name = "Ford";
        car3.count++;
        System.out.println("Car3 name: " + car3.name);
        System.out.println("Car3 count: " + car3.count);

    }
}
