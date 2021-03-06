public class Sorts {
  /*
  *Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */

public static void selectionSort(int [] data) {
  for (int i = 0; i < data.length - 1; i++) {
     int small = i;
    //put x = i + 1, it is the same thing as having the i + 1 when I was trying to find the array earlier.
    for (int x = i + 1; x < data.length; x++) {
      if (data[x] == (Math.min(data[x], data[small]))) {
        small = x;
      }
        //Since it compares the number with the number that comes right after it, we can find the minimum of those two numbers.
      }
    int y = data[small];
    data [small] = data[i];
    data[i] = y;
  }
}

  public static void bubbleSort(int[] data){

    for (int i = 0; i < data.length - 1; i++) {
      //first loop that is the first of the two.
      for (int x = i + 1; x < data.length; x++) {
        //the second intger that is one place bigger than the last one.
        if (data[i] > data[x]) {
          //if the seocnd one is less than the first,
          int temp = data[i];
          data[i] = data[x];
          data[x] = temp;
          //we switch the position.
        }
      }
    }
  }

  public static void insertionSort(int[] data) {
  
    for (int i = 1; i < data.length; i++) {
      int temp = data[i];
      //temporary variable is needed to store.
      while (i > 0 && temp < data[i - 1]) {
        data[i] = data[i - 1];
        //swapping of value
        i--;
        //reduce the loop by doing this and therefore, we get closer to the end.
      }
      data[i] = temp;
      //store current value into a temporary value.
      }
      }

public static String printArray(int[] ary) {
    String output = "[";
    for(int i=0; i<ary.length-1; i++) {
      output += ary[i] + ", ";
    }
    return output += ary[ary.length-1] + "]";
}

public static void main(String[] args) {

    // Google random int generator

    String sorted = "";

    // 8 nums, [0:10]
    int[] test_a = { 3, 4, 7, 1, 6, 2, 8, 6 };
    System.out.println(printArray(test_a));               // [3, 4, 7, 1, 6, 2, 8, 6]

    //selectionsort(test_a);
    //bubbleSort(test_a);
    insertionSort(test_a);


    sorted = printArray(test_a);
    System.out.println(sorted);               // [1, 2, 3, 4, 6, 6, 7, 8]

    if(sorted.equals("[1, 2, 3, 4, 6, 6, 7, 8]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 12 nums, [0:20]
    int[] test_b = { 17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17 };
    System.out.println(printArray(test_b));   // [17, 1, 19, 2, 18, 20, 1, 18, 11, 13, 5, 17]

    //selectionsort(test_b);
    //bubbleSort(test_b);
    insertionSort(test_b);

    sorted = printArray(test_b);
    System.out.println(sorted);               // [1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]

    if(sorted.equals("[1, 1, 2, 5, 11, 13, 17, 17, 18, 18, 19, 20]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

    // 20 nums, [0:100]
    int[] test_c = { 14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52 };
    System.out.println(printArray(test_c));   // [14, 32, 19, 66, 61, 96, 33, 48, 30, 100, 65, 37, 15, 85, 1, 35, 9, 57, 50, 52]

    //selectionSort(test_c);
    //bubbleSort(test_c);
    insertionSort(test_c);

    sorted = printArray(test_c);
    System.out.println(sorted);               // [1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]

    if(sorted.equals("[1, 9, 14, 15, 19, 30, 32, 33, 35, 37, 48, 50, 52, 57, 61, 65, 66, 85, 96, 100]")) {
      System.out.println("TEST CASE - PASS");
    } else {
      System.out.println("TEST CASE - FAIL");
    }

  }


}
