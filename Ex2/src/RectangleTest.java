public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.SetX(5);
        r1.SetY(3);
        r1.setWidth(10);
        r1.setHeight(20);

        r2.SetX(8);
        r2.SetY(9);
        r2.setWidth(10);
        r2.setHeight(20);

        r1.print();
        r1.draw();
        r2.print();
        r2.draw();
    }
}
