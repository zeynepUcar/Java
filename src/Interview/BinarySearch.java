import java.util.Arrays;

public class BinarySearch {


        public static int binarySearch(int arr[], int target) {

            Arrays.sort(arr);

            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                var value = arr[mid];
                if (value == target)
                    return mid;

                if (value < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            // if we reach here, then element was not present
            return -1;
        }
    }


