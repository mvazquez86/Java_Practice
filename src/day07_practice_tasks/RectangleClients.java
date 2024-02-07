package day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.width = 7.2;
        r1.length = 10.5;

        System.out.println(r1);
        double area = r1.calculateArea(r1.width, r1.length);
        System.out.println(area);

        Rectangle r2 = new Rectangle();
        r2.width = 67.89;
        r2.length = 89.56;

        System.out.println(r2);
        double areaR2 = r2.calculatePerimeter(r2.width, r2.length);
        System.out.println(areaR2);

    }
}
