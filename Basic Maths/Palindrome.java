public class Palindrome {

  public static boolean isPalindrome(int n) {
    int dup = n;
    int rev_num = 0;
    while (n > 0) {
      int rem = n % 10;
      rev_num = (rev_num * 10) + rem;
      n = n / 10;
    }

    if (dup == rev_num) {
      return true;
    }
    return false;
  }

  public static void main(String args[]) {
    System.out.println(isPalindrome(121));
  }
}
