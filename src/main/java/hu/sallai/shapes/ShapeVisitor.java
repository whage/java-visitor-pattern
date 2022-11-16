package hu.sallai.shapes;

public interface ShapeVisitor<R, T> {

    R visitCircle(Circle circle, T input);

    R visitSquare(Square square, T input);

}
