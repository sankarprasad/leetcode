package BinarySearch;

public class binarySearchNextGreaterThanLetter {

  public static void main(String[] args) {
    char[] letters = {'a', 'b', 'e', 'f'};
    binarySearchNextGreaterThanLtr(letters, 'g', 0, letters.length - 1);
  }

  static char binarySearchNextGreaterThanLtr(char[] array, char target, int start, int end) {
    if (target < array[0]) return '$';
    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target < array[mid]) {
        end = mid - 1;
      } else if (target > array[mid]) {
        start = mid + 1;
      }
    }
    return array[start % array.length];
  }
}
