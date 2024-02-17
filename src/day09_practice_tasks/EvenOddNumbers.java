package day09_practice_tasks;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7};

        int odd = 0;
        int even = 0;

        for (int number : num) {
            if (number%2==0){
                even+=1;
            }else{
                odd+=1;
            }
        }
        System.out.println("The array has "+ odd + " odd numbers and "+ even + " even numbers");
    }
}
