import java.util.*;

public class ArrayListTest {
  public static void main(String[] args) {
    // ArrayListのインスタンス確保
    ArrayList<String> list = new ArrayList<String>();

    // 要素の追加(addメソッド)
    list.add("Alice");
    list.add("Bob");
    list.add("Chris");

    // 要素の参照(getメソッド)
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}