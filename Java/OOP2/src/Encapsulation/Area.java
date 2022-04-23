package Encapsulation;

public class Area {
    private int length;
    private int width;

    public Area(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Area area = (Area) o;

        if (length != area.length) return false;
        return width == area.width;
    }

    @Override
    public String toString() {
        return "Area{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
