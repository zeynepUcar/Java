public class Animal {
    public String name; // cat, dog
    public String breed;
    public int age;
    public double weight;
    public int legs;
    public boolean poisonous;

    public int getSpeed() {
        return legs * 10;
    }

    public boolean canJump() {
//        if (legs >= 2) {
//            return true;
//        } else {
//            return false;
//        }

        return legs >= 2;
    }

    public void cuteness(){
//        public void String cuteness(){
//        String result = "not cute";
//        return result;   should write like that to assign sth on other class

        if(legs == 0){
            System.out.println("Not cute");
        }else if(legs == 2){
            System.out.println("Some what cute");
        }else if(legs == 4){
            System.out.println("Perfect");
        }else if(legs < 0){
            System.out.println("OMG");
        }else if(legs > 4){
            System.out.println("Scary");
        }
    }

    //        Name: Richard Parker
//        Age:  5
//        Weight: 200.10
//        Breed : Bangal            instead of writing like that we using this method
    public String toString(){
        String output = "";
        output += "Name: " + name + "\n";
        output += "Age: " + age + "\n";
        output += "Weight: " + weight + "\n";
        output += "Breed: " + breed + "\n";

        return output;
    }
}
