public class ShapeTest {
    public  static void main(String[] args) {

        //값을 넘겨줌
        Rectangle r = new Rectangle(3,4);
        Triangle t = new Triangle(3,4);

        //출력
        System.out.println("사각형의 넓이: " +r.area());
        System.out.println("삼각형의 넓이: " +t.area());
    }
}
