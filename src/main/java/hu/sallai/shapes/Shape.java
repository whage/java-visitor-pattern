package hu.sallai.shapes;

public interface Shape {

    <R, T> R visit(ShapeVisitor<R, T> v, T input);

}
