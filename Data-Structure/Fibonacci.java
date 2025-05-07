public class Fibonacci {

  public static int fib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    int fnm1 = fib(n - 1);
    int fnm2 = fib(n - 2);
    return fnm1 + fnm2;
  }

  public static void main(String args[]) {
    System.out.println(fib(2));
  }
}
