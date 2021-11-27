package BinarySearch;

public class binarySearchFloor {

  public static void main(String[] args) {}

  // largest number smaller than or equal to target
  private static int binarySearchFloor(int[] array, int target, int start, int end) {
    if (target < array[0]) return -1;
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (array[mid] == target) return mid;
      if (target < array[mid]) {
        end = mid - 1;
      } else if (target > array[mid]) {
        start = mid + 1;
      }
    }
    return array[end];
  }
}
