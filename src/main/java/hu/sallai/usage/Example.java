package hu.sallai.usage;

import java.util.ArrayList;
import java.util.List;

import hu.sallai.shapes.Circle;
import hu.sallai.shapes.Shape;
import hu.sallai.shapes.Square;

public class Example {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(5, 5));
        shapes.add( new Square(5));

        MyDrawer drawer = new MyDrawer();

        for (Shape shape : shapes) {
            shape.visit(DrawShapeVisitor.INSTANCE, drawer);
        }

        PrettyPrintVisitor ppv = new PrettyPrintVisitor(System.out);

        for (Shape shape : shapes) {
            shape.visit(ppv, "PRETTY");
        }

        double total = 0;

        for (Shape shape : shapes) {
            total += shape.visit(AreaVisitor.INSTANCE, Void.Void);
        }

        System.out.println(total);
    }
}
