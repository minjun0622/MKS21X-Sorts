//Minjun Seo
public static void selectionsort(int [] ary) {
  if (ary.length = 0) {
    return ary[0];
  }
  for (int i = 0; i < ary.length; i++) {
    if ( (Math.min(ary[i], ary[i + 1])) = ary[i]) {
      add(0, ary[i]);
      //if the value at i is less than the element next to it, move it to the beginning.
    }
    if ( (Math.max(ary[i], ary[i - 1])) = ary[i]) {
      add(ary.length - 1, ary[i])
      //if it's greater than move it to the end.
    }
  }
}
