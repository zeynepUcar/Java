public class Rectangle {
    // Create class Rectangle
    // add attributes,
    // add methods: getPerimeter => (a+b+a+b)
    // getArea => (a*b)

    // in other class print those perimeter and area

    public int height; //attribute
    public int length;

    public int getPerimeter(int a, int b){  //method
//        public int getPerimeter(){
//            return 2(height + length);
//        }

        return (a + b + a + b);
    }

    public int getArea(int a, int b){
        return (a*b);
    }
}


