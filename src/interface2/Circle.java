package interface2;

public class Circle implements shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area is: " + area);
    }
}
