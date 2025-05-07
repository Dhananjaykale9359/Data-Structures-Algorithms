public class Armstrong {

  public static boolean isarmstrong(int n) {
    int dup = n;
    int num = 0;
    while (n > 0) {
      int rem = n % 10;
      num = num + (rem * rem * rem);
      n = n / 10;
    }
    if (num == dup) {
      return true;
    }
    return false;
  }

  public static void main(String args[]) {
    System.out.println(isarmstrong(12));
  }
}
