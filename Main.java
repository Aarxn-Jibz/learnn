// https://codeforces.com/gym/307122/problem/B
import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;


public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    StringBuilder a = new StringBuilder("45");
    StringBuilder b = new StringBuilder("55");
    int suma = 9;
    int sumb = 10;
    while(suma < n  || sumb < n) {
      a.reverse();
      a.append("4");
      a.reverse();
      suma += 4;
      b.reverse();
      b.append("5");
      sumb += 5;
    }
    System.out.println(new BigInteger(a.toString()));
    System.out.println(new BigInteger(b.toString()));
  }
}
