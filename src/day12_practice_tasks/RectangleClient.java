package day12_practice_tasks;

public class RectangleClient {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5.3, 7);
        System.out.println(r1);

        Rectangle r2 = new Rectangle(6.1, 8.9);
        System.out.println(r2);

        System.out.println(r1.calcArea());
        System.out.println(r2.calcPerimeter());
    }
}
