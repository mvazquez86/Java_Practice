package day11_practice_tasks;

public class Carpet {

    public double width;
    public double length;
    public int unitPrice;
    public boolean isPersian;

    public double calCost() {
        double cost = 0;

        if (isPersian==false){
            cost = (width*length)*unitPrice;
        }
        else{
            cost = (width*length)*unitPrice+200;
        }

        return cost;


    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", cost is=" + calCost() +
                '}';
    }

    public Carpet(double width, double length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
}
