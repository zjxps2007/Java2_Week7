public class Rectangle extends Shape{
    public Rectangle(int width,int height){
        this.setWidth(width);
        this.setHeight(height);
    }
    public double area() {
        return getWidth()*getHeight();
    }
}
