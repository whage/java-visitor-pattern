package hu.sallai.shapes;

public class Circle implements Shape {

    private final int x;
    private final int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public <R, T> R visit(ShapeVisitor<R, T> v, T input) {
        return v.visitCircle(this, input);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
