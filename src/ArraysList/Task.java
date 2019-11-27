import javax.crypto.spec.PSource;

public class Task {

    public static void main(String[] args) {
        int result = fib(10);
    }
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
    static int fib(int N) {
        int first = 0;
        int second = 1;
        int fibNum;
        if (N == 0)
            return  first;

        for (int i = 0; i <= N; i++) {
            fibNum = first + second;
            first = second;
            second = fibNum;
            System.out.println(fibNum);

        }
        return -1;
    }





}