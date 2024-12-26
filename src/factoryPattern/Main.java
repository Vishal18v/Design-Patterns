package factoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new CircleFactory();
        shapeFactory.createShape().draw();
    }
}