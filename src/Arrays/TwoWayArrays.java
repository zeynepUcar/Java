public class TwoWayArrays {
    public static void main(String[] args) {
        int [] arr = {2, 11, 45, 9};
                                            // both of them are same
        int [] arr1 = new int[4];
        arr1[0] = 2;
        arr1[1] = 11;
        arr1[2] = 45;
        arr1[3] = 9;

        for (int num : arr){
            System.out.println(num);
        }
                                                 // those for's ar e same, too
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        char[] chars = {'A', 'B', 'C', 'D', 'E'};
        for(char c : chars){
            System.out.println(c);
        }

    }
}
