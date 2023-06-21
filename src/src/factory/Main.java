package factory;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("Rectangle");
        shape.draw();
    }
}
