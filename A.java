class A {
  // a: インスタンスフィールド
  int a = 123;
  // b: クラスフィールド
  static int b = 456;
  // c: インスタンスフィールド d; 引数
  int c(int d) {
    // e: ローカル変数
    int e = 1;
    return a + d + e;
  }
  // f: クラスメソッド g: 引数
  static int f(int g) {
    // h: ローカル変数
    int h = 789;
    // i: ローカル変数
    for (int i = 0; i < h; i++) {
      g++;
    }
    return g;
  }
}