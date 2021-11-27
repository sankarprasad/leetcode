package BinarySearch;

public class searchInMountainArray {
  public static void main(String[] args) {
    int[] array = {1, 2, 4, 5, 6, 8, 7, 3};
    int peakIndex = findPeak(array);
    int target = 3;
    int found = BinarySearch.binarySearch(array, target, 0, peakIndex);
    if (found == -1) {
      found =
          BinarySearch.orderAgnosticBinarySearch(array, target, peakIndex + 1, array.length - 1);
    }
    System.out.println(found);
  }

  public static int findPeak(int[] array) {
    int start = 0;
    int end = array.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (array[mid] > array[mid + 1]) {
        // descending part of mountain
        end = mid;
      } else {
        // ascending part of mountain
        start = mid + 1;
      }
    }
    // if it doesnt belong to above condition then start == end and loop would end;
    return start;
  }
}
