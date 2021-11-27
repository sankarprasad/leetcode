package BinarySearch;

public class searchInRotatedSortedArray {

  public static void main(String[] args) {
    int[] array = {5, 6, 7, 8, 0, 1, 2, 3, 4};
    int target = 7;
    System.out.println("Found Index: " + search(array, target));
    ;
    System.out.println("Rotations: " + countRotations(array, target));
  }

  private static int countRotations(int[] array, int target) {
    // {0,1,2,3,4,5,6,7,8} ---> rotate 4 times to get below array
    //  {5,6,7,8,0,1,2,3,4} --> pivot point is 8 (pos = 3)
    int pivotPos = findPivot(array, target);
    if (pivotPos == -1) return 0;
    return pivotPos + 1;
  }

  private static int search(int[] array, int target) {
    int pivot = findPivot(array, target);
    if (pivot == -1) {
      return BinarySearch.binarySearch(array, target, 0, array.length);
    }
    if (array[pivot] == target) return pivot;
    if (target > array[0]) {
      return BinarySearch.binarySearch(array, target, 0, pivot - 1);
    }
    return BinarySearch.binarySearch(array, target, pivot + 1, array.length - 1);
  }

  private static int findPivot(int[] array, int target) {

    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      // 4 cases:
      if (mid < end && array[mid] > array[mid + 1]) {
        return mid;
      }
      if (mid > start && array[mid] < array[mid - 1]) {
        return mid - 1;
      }

      if (array[start] >= array[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  private static int findPivotWidthDuplicate(int[] array, int target) {

    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      // 4 cases:
      if (mid < end && array[mid] > array[mid + 1]) {
        return mid;
      }
      if (mid > start && array[mid] < array[mid - 1]) {
        return mid - 1;
      }
      // start element == mid element == end element this will fail {2,2,2,9,2}
      //   if (array[start] >= array[mid]) {
      //     end = mid - 1;
      //   } else {
      //     start = mid + 1;
      //   }

      if ((array[start] == array[mid]) && (array[mid] == array[end])) {
        // skip duplicates
        // check if start itself is the pivot point
        if (array[start] > array[start + 1]) return start;
        start++;
        if (array[end] > array[end - 1]) return end;
        end--;
      }

      // left side is sorted and pivot should be in the right
      if ((array[start] < array[mid])
          || ((array[start] == array[mid]) && (array[mid] > array[end]))) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
