public class NamedRectangle extends Rectangle {
  String name;
  NamedRectangle() {
    // super(); // 省略しても同じ
    // name = "NO NAME";

    this("NO NAME");
  }

  NamedRectangle(String name) {
    super(200, 32); // 省略するとsuper();
    this.name = name;
  }
}