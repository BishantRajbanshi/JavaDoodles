public class PresentOrNot {
  public static void main(String[] args) {
      String[] array = {"apple", "banana", "orange", "grape", "kiwi"};
      String elementToFind = "orange";

      int index = searchElement(array, elementToFind);

      if (index != -1) {
          System.out.println("Element found at index: " + index);
      } else {
          System.out.println("Element '" + elementToFind + "' not found in the array.");
      }
  }

  static int searchElement(String[] array, String element) {
      for (int i = 0; i < array.length; i++) {
          if (array[i].equals(element)) {
              return i;
          }
      }
      return -1;
  }
}

