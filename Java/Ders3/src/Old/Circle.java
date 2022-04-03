package Old;

public class Circle {
    final double PI = 3.14;
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public final double getArea(){
        return PI*r*r;
    }
}
