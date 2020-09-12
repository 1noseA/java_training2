public class Q11_9 {
  final int INITIAL_WIDTH = 0;
  final int INITIAL_HEIGHT = 0;
  int width;
  int height;
  int x;
  int y;

  Q11_9() {
    width = INITIAL_WIDTH;
    height = INITIAL_HEIGHT;
    x = 0;
    y = 0;
  }

  Q11_9(int width, int height) {
    this.width = width;
    this.height = height;
    this.x = 0;
    this.y = 0;
  }

  Q11_9(int x, int y, int width, int height) {
    this.width = width;
    this.height = height;
    this.x = x;
    this.y = y;
  }

  void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  void setSize(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public String toString() {
    return "[" + x + ", " + y + ", " + width + ", " + height + "]";
  }

  Q11_9 intersect(Q11_9 q) {
    int sx = Math.max(this.x, q.x);
    int sy = Math.max(this.y, q.y);
    int ex = Math.min(this.x + this.width, q.x + q.width);
    int ey = Math.min(this.y + this.height, q.y + q.height);
    int newwidth = ex - sx;
    int newheight = ey - sy;
    if (newwidth > 0 && newheight > 0) {
      return new Q11_9(sx, sy, newwidth, newheight);
    } else {
      return null;
    }
  }

  public static void main(String[] args) {
    Q11_9 a, b, c, d, e;
    a = new Q11_9(0, 0, 20, 10);
    b = new Q11_9(5, 5, 20, 10);
    c = new Q11_9(20, 10, 20, 10);
    d = new Q11_9(-10, -20, 100, 200);
    e = new Q11_9(21, 11, 20, 10);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
    System.out.println("e = " + e);
    System.out.println("a と a の重なり = " + a.intersect(a));
    System.out.println("a と b の重なり = " + a.intersect(b));
    System.out.println("a と c の重なり = " + a.intersect(c));
    System.out.println("a と d の重なり = " + a.intersect(d));
    System.out.println("a と e の重なり = " + a.intersect(e));
  }
}