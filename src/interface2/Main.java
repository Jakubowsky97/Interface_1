package interface2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(15, 25);
        System.out.println("Circle");
        circle.calculateArea();

        System.out.println("Rectangle");
        rectangle.calculateArea();

    }
}
