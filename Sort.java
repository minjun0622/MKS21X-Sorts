//Minjun Seo
public static void selectionsort(int [] ary) {
  if (ary.length = 0) {
    return ary[0];
  }
  for (int i = 0; i < ary.length; i++) {
    if ( (Math.min(ary[i], ary[i + 1])) = ary[i]) {
      ary[i] = ary[0];
    }
    if ( (Math.max(ary[i], ary[i - 1])) = ary[i]) {
      ary[i] = ary[ary.length - 1];
    }
  }
}
