// https://codeforces.com/gym/307122/problem/B
import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;


public class Main {
  static int checksum(BigInteger n) {
    int sum = 0;
    while(n.compareTo(BigInteger.ZERO) > 0) {
      sum += n.mod(BigInteger.valueOf(10)).intValue();
      n = n.divide(BigInteger.valueOf(10));
    }
    return sum;
  }  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    String a = new String("45");
    String b = new String("55");
    while(checksum(new BigInteger(a)) < n  || checksum(new BigInteger(b)) < n) {
      a = "4" + a;
      b = "5" + b;
    }
    System.out.println(new BigInteger(a));
    System.out.println(new BigInteger(b));
  }
}
