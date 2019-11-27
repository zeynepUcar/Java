public class Array1 {
    public static void main(String[] args) {
        int number [] = {-3, 56, 87, 32, 1, 987};

        int max = number[0];
        int min = number[0];
        for (int i = 0; i < number.length; i++) {

            if (number[i] > max)
                max = number[i];
            if (number[i] < min)
                min = number[i];

        }
        System.out.println(min);
        System.out.println(max);



    }

}
