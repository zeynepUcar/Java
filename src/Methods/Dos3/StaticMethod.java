class Calculus{
    public static int sumOfTwoIntegers(int a, int b){
        return a+ b;
    }
}


public class StaticMethod {

//    Calculus calc = new  Calculus();
//    int total = calc.sum(10, 20);       instead of using this, we used belowed one. because we have static.
    //                                    If we dont have static we need to create method.
    int total = Calculus.sumOfTwoIntegers(10, 20);



}
