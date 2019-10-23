public class Triangle extends Shape{

    //넘겨받은 값을  Shape 클래스에 저장
    public Triangle(int width, int height){
        this.setHeight(height);
        this.setWidth(width);
    }
    //넒이 반환
    public double area(){

        return (getWidth()*getHeight()/2.0);
    }
}
