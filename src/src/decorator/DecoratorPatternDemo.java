package decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Shape shape = new Circle();

        RedCircleDecorator redCircleDecorator = new RedCircleDecorator(shape);

        redCircleDecorator.name();
        
    }
    
}
