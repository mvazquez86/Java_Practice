package day12_practice_tasks;

public class Rectangle {

    private double width;
    private double length;

    //setters
    public void setWidth(double width) {
        if (width<=0){
            System.err.println("width can not be negative number");
            System.exit(1);
        }
        this.width = width;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("length can not be negative number");
            System.exit(1);
        }
        this.length = length;
    }

    //getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //constructor
    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter(){
        return (width + length)*2;
    }

    public String toString() {
        return "Rectangle{" +
                "width = " + width +
                ", length = " + length +
                ", perimeter = " + calcPerimeter() +
                ", area = " + calcArea() +
                '}';
    }
}
