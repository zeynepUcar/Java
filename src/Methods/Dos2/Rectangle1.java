public class Rectangle1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        r1.height = 5;
        r1.length = 10;
         int perimeter = r1.getPerimeter(5, 10);
        System.out.println(perimeter);
         int area = r1.getArea(5,10);
        System.out.println(area);
    }}
