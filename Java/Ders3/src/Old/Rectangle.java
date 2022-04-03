package Old;

public class Rectangle implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println(length*breadth);
    }
}
