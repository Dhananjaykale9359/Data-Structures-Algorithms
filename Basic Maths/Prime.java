public class Prime {

  public static boolean isPrime(int n) {
    boolean isPrimes = true;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        isPrimes = false;
      }
    }
    return isPrimes;
  }

  public static void main(String args[]) {
    System.out.println(isPrime(3));
  }
}
