package Interfaces;

public class Rectangle implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of rectangle is: " + (length*breadth));
    }
}
