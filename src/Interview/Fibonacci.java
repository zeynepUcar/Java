public class Fibonacci {
    public static void main(String[] args) {
        //BigInteger to hold big numbers
        long[] nums = new long[100];

        //fib(n) = fib(n-2) + fib(n-1);
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = nums[1] + nums[2];

        for (int i = 3; i < nums.length; i++) {
            nums[i] = nums[i - 2] + nums[i - 1];
            // nums[3] = nums[3-2] + nums[3-1];
            // nums[3] = nums[1] + nums[2];
        }

        for (long num : nums) {
            System.out.print(num + " ");
        }

        // 2. Way

        int n = 10;
        int first = 0;
        int second = 1;

        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print( second +  "  ");

            int sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println();
    }
}
