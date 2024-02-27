package day11_practice_tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    //constructor
    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    //toString
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizza cost=" + calCost()+
                '}';
    }

    //methods or actions
    public double calCost(){
        double finalPrice = 0;

        if (size == "Large"){
            finalPrice = 14 + numberOfCheeseTopping*2 + numberOfPepperoniTopping*2;
        }

        else if(size.equalsIgnoreCase("medium")){
            finalPrice = 12 + numberOfCheeseTopping*2 + numberOfPepperoniTopping*2;
        } else if (size.equalsIgnoreCase("small")) {
            finalPrice = 10 + numberOfPepperoniTopping*2 + numberOfCheeseTopping*2;
        }else {
            System.out.println("we do not carry that size");
        }

        return finalPrice;
    }
}
