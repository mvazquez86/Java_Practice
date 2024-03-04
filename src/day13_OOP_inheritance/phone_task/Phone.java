package day13_OOP_inheritance.phone_task;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    //constructor


    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    //setters and getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand.isBlank() || brand.isBlank() || brand == null){
            System.err.println("Invalid brand input");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isBlank() || model.isBlank() || model == null){
            System.err.println("Invalid model input");
            System.exit(1);
        }

        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Price has to be greater than $0");
            System.exit(1);
        }

        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isBlank() || color.isBlank() || color == null){
            System.err.println("Invalid brand input");
            System.exit(1);
        }
        this.color = color;
    }

    public void call (String phoneNumber){
        System.out.println("Calling the number "+ phoneNumber);
    }

    public void text (String phoneNumber){
        System.out.println("Texting the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
