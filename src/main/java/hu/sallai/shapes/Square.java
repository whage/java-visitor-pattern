package hu.sallai.shapes;

public class Square implements Shape {

    private final int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public <R, T> R visit(ShapeVisitor<R, T> v, T input) {
        return v.visitSquare(this, input);
    }

    public int getA() {
        return a;
    }

}
