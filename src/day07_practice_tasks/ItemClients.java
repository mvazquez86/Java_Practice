package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item i1 = new Item();
        i1.unitPrice = 25;
        i1.itemName = "Book";
        i1.qty = 5;

        System.out.println(i1);

       double totalCost = i1.calcCost();
        System.out.println(totalCost);
    }
}
