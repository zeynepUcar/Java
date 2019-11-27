public class Task6 {
    // Write a String method called firstHalf,
    //    which takes an String as input and returns first half
    //1.part
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        String s1 =firstHalf(text);
        System.out.println(s1);
        String s2 = secondHalf(text);
        System.out.println(s2);
    }

    public static String firstHalf(String s){

        return s.substring(0,s.length()/2);
    }

    // Write second method called secondHalf
    //    which takes an String as input and returns second half

    //2.part

    public static String secondHalf(String s){

        return s.substring(s.length()/2);
    }

}
