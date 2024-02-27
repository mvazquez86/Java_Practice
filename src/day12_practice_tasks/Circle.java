package day12_practice_tasks;
public class Circle {

    private double radius;

    //setter
    public void setRadius(double radius) {
        if(radius<=0) {
            System.err.println("Radius can not be negative");
            System.exit(1);
        }
        this.radius = radius;
    }

    //getter
    public double getRadius() {
        return radius;
    }

    //constructor
    public Circle(double radius) {
        setRadius(radius);
    }

    //actions
    public double calcArea(){
        return Math.PI * radius*radius;
    }

    public double calPerimeter(){
        return Math.PI * radius *2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                "area= " + calcArea() +
                "perimeter= " + calPerimeter() +
                '}';
    }
}
