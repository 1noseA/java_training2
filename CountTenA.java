// 手軽だがTreadクラスを拡張してしまうと他のクラスを拡張できない
public class CountTenA extends Thread {
  public static void main(String[] args) {
    CountTenA ct = new CountTenA();
    ct.start();
    for (int i = 0; i < 10; i ++) {
      System.out.println("main:i = " + i);
    }
  }

  @Override
  public void run() {
    for(int i = 0; i < 10; i++) {
      System.out.println("run:i = " + i);
    }
  }
}