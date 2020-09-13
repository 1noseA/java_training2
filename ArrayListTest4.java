import java.util.*;

public class ArrayListTest4 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("Alice");
    list.add("Bob");
    list.add("Chris");
    list.add("Diana");
    list.add("Elmo");

    System.out.println("削除前");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(i + ":" + list.get(i));
    }
    System.out.println();

    // 削除
    list.remove("Alice");
    list.remove("Bob");
    list.remove("Elmo");

    System.out.println("削除後");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(i + ":" + list.get(i));
    }
    System.out.println();

    // Aliceは含まれているか
    if (list.contains("Alice")) {
      System.out.println("listにAliceは含まれています。");
    } else {
      System.out.println("listにAliceは含まれていません。");
    }
  }
}