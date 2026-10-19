import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i = 0; i < n; i++) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int stop[] = new int[n];
      for(int j = 0; j < n; j++) {
        stop[j] = sc.nextInt();
      }
      int ar[] = new int[n + 1];
      for(int j = 0; j < n; j++) {
        if(j == 0) {
          ar[j] = stop[0] - 0;
        }
        ar[j] = stop[j] - stop[j - 1];
      }
      ar[n] = 2 * (x - stop[n - 1]);
      Arrays.sort(ar);
      System.out.println(ar[n]);
    }
  }
}
