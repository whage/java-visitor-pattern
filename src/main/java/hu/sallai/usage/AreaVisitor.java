package hu.sallai.usage;

import hu.sallai.shapes.Circle;
import hu.sallai.shapes.ShapeVisitor;
import hu.sallai.shapes.Square;

public enum AreaVisitor implements ShapeVisitor<Double, Void> {

    INSTANCE;


    @Override
    public Double visitCircle(Circle circle, Void nothing) {
        return circle.getX() * circle.getX() * 3.141;
    }

    @Override
    public Double visitSquare(Square square, Void nothing) {
        return (double) (square.getA() * square.getA());
    }

}
