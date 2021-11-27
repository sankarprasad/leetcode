package BinarySearch;

public class splitArrayLargestSum {

  // HARD LEVEL
  public static void main(String[] args) {
    // { 7, 2, 5, 10, 8 } , m = 2 ans-> {7,2,5}, {10, 8} --> largest sum is min 18 among all
    // combinations
    int[] array = {7, 2, 5, 10, 8};
    int numOfSplits = 2;
    System.out.println(findCombinations(array, numOfSplits));
    ;
  }

  private static int findCombinations(int[] array, int numOfSplits) {
    int start = 0;
    int end = 0;
    // find the min and max sum... min sum is max of {7},{2},{5},{10},{8}
    // end should be sum of {...array}
    // now apply binary search as sum must be between {10, 32}
    for (int i = 0; i < array.length; i++) {
      start = Math.max(start, array[i]);
      end += array[i];
    }

    while (start < end) {
      int mid = start + (end - start) / 2;

      int sum = 0;
      int pieces = 1;
      for (int num : array) {
        if (sum + num > mid) {
          // exceeds the value, create a new pieces and add it in it
          sum = num;
          pieces++;
        } else {
          // add to the array and update the sum
          sum += num;
        }
      }
      if (pieces > numOfSplits) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start; // here start == end
  }
}
