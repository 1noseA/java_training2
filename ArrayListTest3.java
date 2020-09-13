import java.util.*;

public class ArrayListTest3 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    list.add(12);
    list.add(34);
    list.add(56);
    list.add(78);
    list.add(90);

    for (int n : list) {
      System.out.println(n);
    }
  }
}