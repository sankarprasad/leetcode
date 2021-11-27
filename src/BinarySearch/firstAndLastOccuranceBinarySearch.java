package BinarySearch;

import java.util.Arrays;

public class firstAndLastOccuranceBinarySearch {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 7, 7, 7, 7, 8, 8, 9, 9};
    int[] ans = {-1, -1};
    ans[0] = firstAndLastOccurance(array, 7, true);
    ans[1] = firstAndLastOccurance(array, 7, false);
    System.out.println(Arrays.toString(ans));
  }

  public static int firstAndLastOccurance(int[] array, int target, boolean firstIndex) {
    int ans = -1;
    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (array[mid] == target) {
        // one potential ans found
        ans = mid;
        if (firstIndex) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
      if (target < array[mid]) {
        end = mid - 1;
      } else if (target > array[mid]) {
        start = mid + 1;
      }
    }
    return ans;
  }
}
