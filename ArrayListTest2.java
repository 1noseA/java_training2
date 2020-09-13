import java.util.*;

public class ArrayListTest2 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("Alice");
    list.add("Bob");
    list.add("Chris");
    list.add("Diana");
    list.add("Elmo");

    // イテレータを使ったforループ
    // for (Iterator<String> it = list.iterator(); it.hasNext();) {
    //   String name = it.next();
    //   System.out.println(name);
    // }

    // 拡張forループ
    for (String name : list) {
      System.out.println(name);
    }
  }
}