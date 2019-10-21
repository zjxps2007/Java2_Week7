public class Shape {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public void SetX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void SetY(int y) {
        this.y = y;
    }
    void print() {
        System.out.println("x좌표: "+x+" y죄표: "+y);
    }
}
