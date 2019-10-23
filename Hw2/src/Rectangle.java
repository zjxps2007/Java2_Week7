public class Rectangle extends Shape{

    //넘겨받은 값을  Shape 클래스에 저장
    public Rectangle(int width,int height){
        this.setWidth(width);
        this.setHeight(height);
    }
    //넓이 반환
    public double area() {

        return getWidth()*getHeight();
    }
}
