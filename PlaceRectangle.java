public class PlaceRectangle extends Rectangle {
  int x;
  int y;

  PlaceRectangle() {
    setLocation(0, 0);
  }

  PlaceRectangle(int x, int y) {
    setLocation(123, 45);
  }

  PlaceRectangle(int x, int y, int width, int height) {
    super(width, height);
    setLocation(x, y);
  }

  void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "[ (" + x + ", " + y + ")" + super.toString() + "]";
  }

  public static void main(String[] args) {
    PlaceRectangle a = new PlaceRectangle();
    PlaceRectangle b = new PlaceRectangle(12, 34);
    PlaceRectangle c = new PlaceRectangle(31, 41, 59, 26);
    PlaceRectangle d = new PlaceRectangle(1, 2, 100, 200);
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
    System.out.println("d = " + d);
  }
}