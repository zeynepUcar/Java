public class Task10 {
    public static void main(String[] args) {
        int [] arr = {100,2,4,5,6,7,8,9,10};

        int i = arr.length -1 ;

        int c = 0; // will give value of index 0
        while (i >= 0){
            System.out.print(arr[i] + " " + arr[0]);
            i--;
        }
    }
}
