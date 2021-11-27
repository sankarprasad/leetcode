package Recursion.Array;

public class BinarySearch {
  public static void main(String[] args) {
    int[] array = {
      -3, -1, 0, 1, 2, 31, 42, 52, 60, 97, 100, 900,
    };

    int[] array1 = {6, 5, 4, 3, 2, 1, -1};

    System.out.println(orderAgnosticBinarySearch(array1, 5, 0, array1.length - 1));
    System.out.println(binarySearch(array, 1, 0, array.length - 1));
  }

  public static int binarySearch(int[] array, int target, int start, int end) {
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (array[mid] == target) return mid;
      if (target < array[mid]) {
        end = mid - 1;
      } else if (target > array[mid]) {
        start = mid + 1;
      }
    }
    return -1;
  }

  public static int orderAgnosticBinarySearch(int[] array, int target, int start, int end) {
    boolean isAsc = array[start] < array[end];
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (array[mid] == target) return mid;

      if (isAsc) {
        if (target < array[mid]) {
          end = mid - 1;
        } else if (target > array[mid]) {
          start = mid + 1;
        }
      } else {
        if (target < array[mid]) {
          start = mid + 1;
        } else if (target > array[mid]) {
          end = mid - 1;
        }
      }
    }
    return -1;
  }
}
