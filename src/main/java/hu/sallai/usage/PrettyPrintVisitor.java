package hu.sallai.usage;

import java.io.PrintStream;

import hu.sallai.shapes.Circle;
import hu.sallai.shapes.ShapeVisitor;
import hu.sallai.shapes.Square;

public class PrettyPrintVisitor implements ShapeVisitor<Object, String> {

    private PrintStream ps;

    public PrettyPrintVisitor(PrintStream ps) {
        this.ps = ps;
    }

    @Override
    public Object visitCircle(Circle circle, String prefix) {
        ps.println(prefix + " - Circle (" + circle.getX() + "," + circle.getY() + ")");
        return null;
    }

    @Override
    public Object visitSquare(Square square, String prefix) {
        ps.println(prefix + " - Square (" + square.getA() + ")");
        return null;
    }

}
