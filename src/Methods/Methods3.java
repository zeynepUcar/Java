public class Methods3 {
    public static void main(String[] args) {
        Vehicle v =  new Vehicle(); // calling vehicle
        //field
        v.doors = 4;
        v.speed = 65;
        v.run();
    }
}
class Vehicle{
    public int doors;
    public int speed;
    public  String color;
    public void run(){  //if you put private, main class wont see it
        System.out.println("I am running");

    }
}
