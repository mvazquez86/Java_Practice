package day12_practice_tasks;

public class Candy {

    private String brand;
    private int qty;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int qty, double price, boolean hasPeanuts) {
        setBand(brand);
        setQty(qty);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBand() {
        return brand;
    }

    public void setBand(String brand) {
        this.brand = brand;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if (qty <0){
            System.err.println("quantity can not be less than zero");
            System.exit(1);
        }
        if (qty == 0){
            System.out.println("it is free");
        }
        this.qty = qty;
    }

    public double getPrice() {
        if (price ==0){
            System.out.println("it is free");
        }
        return price;
    }

    public void setPrice(double price) {
        if (price <0){
            System.err.println("price can not be less than zero");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                ", the price is " + price+'}';


    }
}
