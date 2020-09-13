import java.util.*;

public class ArrayListTest5 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();

    list.add("Alice");
    list.add("Bob");
    list.add("Chris");
    list.add("Bob");
    list.add("Elmo");

    // 最初と最後の要素の参照（getメソッドとsizeメソッド）
    System.out.println("最初の要素 = " + list.get(0));
    System.out.println("最後の要素 = " + list.get(list.size() - 1));

    // 全ての要素の参照（拡張forループ）
    for (String s : list) {
      System.out.println(s);
    }

    // Bobの添字を調べる
    System.out.println("最初に出てくるBobの添字 = " + list.indexOf("Bob"));
    System.out.println("最後に出てくるBobの添字 = " + list.lastIndexOf("Bob"));
  }
}