import java.util.*;

public class LinkedListTest {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();

    list.add("Bob");
    list.add("Chris");
    list.add("Diana");
    list.add("Elmo");

    // 現在の状態
    System.out.println(list);

    // 先頭にAliceを挿入
    list.addFirst("Alice");

    // Aliceを挿入した後の状態
    System.out.println(list);
  }
}