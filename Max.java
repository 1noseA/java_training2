import static java.lang.System.out;
import static java.lang.Math.max;

public class Max {
  public static void main(String[] args) {
    int x = 45;
    int y = 100;
    // int z = Math.max(x, y);と書く代わりに
    // Math.maxは引数で与えられた2数のうち大きい方の数を得る
    int z = max(x, y);
    out.println("z = " + z);
  }
}