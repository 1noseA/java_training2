class Y extends X {
  Y() {
    System.out.println("3: Y()");
  }
  Y(int x) {
    System.out.println("4: Y(int x)");
  }
  Y(String s) {
    super(789);
    System.out.println("5: Y(String s)");
  }

  public static void main(String[] args) {
    System.out.println("-----");
    new X();
    System.out.println("-----");
    new Y();
    System.out.println("-----");
    new X(123);
    System.out.println("-----");
    new Y(456);
    System.out.println("-----");
    new Y("test");
    System.out.println("-----");
  }
}