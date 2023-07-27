package decorator;

public class RedCircleDecorator extends CircleDecorator{

    private Shape decoratorShape;

    public RedCircleDecorator(Shape shape) {
        super(shape);
        this.decoratorShape = shape;
    }

    @Override
    public void name() {
        this.decoratorShape.name();
        setRedColor();
    }

    private void setRedColor() {
        System.out.println("Set Red Color .....");
    }
    
}
