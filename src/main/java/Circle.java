public class Circle extends Shape {
    private double radius =1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;

    }

    public double getPerimeter() {
        return 2*radius*Math.PI;
    }

    public String toString() {
        return "The circle with radius: "
                + getRadius()
                + " Which is a subclass of "
                + super.toString();
    }
}

class demo1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);

        Circle circle2 = new Circle(3.5,"indigo",false);
        System.out.println(circle2);
    }
}
