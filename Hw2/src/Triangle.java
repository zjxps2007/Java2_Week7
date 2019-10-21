public class Triangle extends Shape{
    public Triangle(int width, int height){
        this.setHeight(height);
        this.setWidth(width);
    }
    public double area(){
        return (getWidth()*getHeight()/2.0);
    }
}
