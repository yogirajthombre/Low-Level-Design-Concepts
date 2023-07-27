package decorator;

public class CircleDecorator implements Shape{

    private Shape shape;

    public CircleDecorator(Shape shape){
        this.shape = shape;
    }

    @Override
    public void name() {
        shape.name();
    }
    
}
