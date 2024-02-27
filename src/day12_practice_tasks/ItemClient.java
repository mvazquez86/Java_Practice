package day12_practice_tasks;

public class ItemClient {

    public static void main(String[] args) {

        Item i1 = new Item("Computer", 1500, 2);
        System.out.println(i1);

        Item i2 = new Item ("house",145_000,1);
        System.out.println(i2);
        i2.setQty(3);
        System.out.println(i2.calCost());
    }
}
