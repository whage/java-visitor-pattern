package hu.sallai.usage;

import hu.sallai.shapes.Circle;
import hu.sallai.shapes.ShapeVisitor;
import hu.sallai.shapes.Square;

public enum DrawShapeVisitor implements ShapeVisitor<Void, MyDrawer> {
    
    INSTANCE;

    @Override
    public Void visitCircle(Circle c, MyDrawer ctx) {
        ctx.draw("Circle (" + c.getX() + "," + c.getY() + ")");
        return Void.Void;
    }

    @Override
    public Void visitSquare(Square s, MyDrawer ctx) {
        ctx.draw("Square (" + s.getA() + ")");
        return Void.Void;
    }

}
