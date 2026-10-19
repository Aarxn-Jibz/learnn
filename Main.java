// https://codeforces.com/gym/307122/problem/A
import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    StringBuilder s = new StringBuilder("");
    for(int i = 0; i < n; i++) {
      if (i == 0) {
        s.append('a');
      } else if(i == 1) {
        s.append('a');
      } else if(i == 2) {
        s.append('b');
      } else {
        if(s.charAt(i - 2) == 'a') {
        s.append('b');
        } else if(s.charAt(i - 2) == 'b') {
        s.append('a');
        }
      }
    }
    System.out.println(s);
  }
}