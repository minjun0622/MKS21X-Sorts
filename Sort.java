public static void selectionsort(int [] ary) {
  if (ary.length = 0) {
    return ary[0];
  }
  for (int i = 0; i < ary.length; i++) {
    if (ary[i + 1] < ary[i]) {
      ary[i] = ary[i + 1];
    }
  }
}