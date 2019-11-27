public class ArrayString {
    public static void main(String[] args) {
        String season [] = {"winter", "spring", "summer", "fall"};
        season [3] = "autumn";

        System.out.println(season[3]);
        System.out.println(season.length);

        for (String i : season){
            System.out.println(i);
        }
    }
}
