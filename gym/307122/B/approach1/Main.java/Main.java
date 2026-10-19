// https://codeforces.com/gym/307122/problem/B
import java.util.Scanner;
import java.lang.Math;

public class Main {
  static int checksum(int n) {
    int sum = 0;
    while(n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a = n;
    int b = n;
    int co = 0;
    while(true) {
      if(checksum(a) >= n && checksum(b) >= n && checksum(a + b) <= m) {
        break;
      }
      if(checksum(a) < n) {
        a++;
      }
      if(checksum(b) < n) {
        b++;
      }
      int diff = checksum(a + b);
      if(diff > m) {
        diff -= m;
        a += diff;
      }
    }
    if(a > 9) {
      a %= 9;
    }
    if(b > 9) {
      b %= 9;
    }
    System.out.println(a);
    System.out.println(b);
  }
}
//TLE