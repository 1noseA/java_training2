public class Q11_6 {
  int width;
  int height;

  // Rectangle() {
  //   setSize(10, 20);
  // }

  // Rectangle(int w, int h) {
  //   setSize(w, h);
  // }

  void setSize(int w, int h) {
    // 問11-8
    // マイナスになるなら強制的に0を入れる
    if (w < 0) {
      w = 0;
    }
    if (h < 0) {
      h = 0;
    }
    width = w;
    height = h;
  }

  int getArea() {
    return width * height;
  }

  // 二つのRectangleを比較して、等しかったらtrue、
  // 等しくなかったらfalseを返す
  // boolean areSome(Rectangle a, Rectangle b) {
  //   if (a == null || b == null) {
  //     return false;
  //   } else if (a.width == b.width && a.height == b.height) {
  //     return true;
  //   } else {
  //     return false;
  //   }
  // }

  // thisと引数のRectangleを比較して、等しかったらtrue、
  // 等しくなかったらfalseを返す
  // もしくは上記のコードにstaticをつける
  // @Override
  boolean equals(Rectangle a) {
    if (a == null) {
      return false;
    } else if (width == a.width && height == a.height) {
      return true;
    } else {
      return false;
    }
  }

  // 問11-7
  // @Override
  public String toString() {
    return "Rectangle(" + width + "," + height + ")";
  }
}