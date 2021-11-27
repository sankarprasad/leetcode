package BinarySearch;

public class searchInInfiniteArray {
  public static void main(String[] args) {
    int[] array = {2, 3, 3, 5, 6, 7, 89, 100, 111};
    int target = 7;
    System.out.println(findRangeAndSearch(array, target));
  }

  private static int findRangeAndSearch(int[] array, int target) {
    int start = 0;
    int end = 1;

    while (target > array[end]) {
      int tempEnd = end;
      int range = end - start + 1;
      end += range * 2;
      start = tempEnd + 1;
    }

    return BinarySearch.binarySearch(array, target, start, end);
  }
}
