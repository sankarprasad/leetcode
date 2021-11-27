package BinarySearch;

public class binarySearchCeiling {
  public static void main(String[] args) {}

  // smallest number greater than or equal to target
  private static int binarySearchCeiling(int[] array, int target, int start, int end) {
    if (target > array[array.length - 1]) return -1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (array[mid] == target) return mid;
      if (target < array[mid]) {
        end = mid - 1;
      } else if (target > array[mid]) {
        start = mid + 1;
      }
    }
    return array[start];
  }
}
