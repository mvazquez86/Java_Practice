package day04_practice_tasks;

public class CrewAndPassenger {

    public static void main(String[] args) {

        int passenger = 100;

        if (passenger==50){
            System.out.println("20 crew, 30 passengers");
        }

        else if (passenger==75){
            System.out.println("25 crew, 50 passengers");
        }

        else if (passenger==100){
            System.out.println("30 crew, 70 passengers");
        }

        else {
            System.out.println("Invalid amount of people");
        }
    }
}
