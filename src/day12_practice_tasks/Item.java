package day12_practice_tasks;

public class Item {

    private String name;
    private double price;
    private int qty;

    //setters
    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            System.err.println("The name is invalid");
            System.exit(1);
        }
        if (!name.matches("^[a-zA-Z\\s]+$")) {
            System.err.println("Name must contain only letters and spaces.");
            System.exit(1);
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("price can not be negative");
            System.exit(1);
        }
        this.price = price;
    }

    public void setQty(int qty) {
        if (qty<0){
            System.err.println("Quantity can not be negative");
            System.exit(1);
        }
        this.qty = qty;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    //constructor
    public Item(String name, double price, int qty) {
        setName(name);
        setPrice(price);
        setQty(qty);
    }

    public double calCost(){
        return qty*price;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", total cost = " + calCost() +
                '}';
    }
}
