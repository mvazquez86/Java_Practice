package day04_practice_tasks;

public class ChooseLanguage {

    public static void main(String[] args) {

        int n = 8;

        if(n==1){
            System.out.println("Hello, thank you for your call");
        }

        else if(n==2){
            System.out.println("Hola, gracias por llamar");
        }

        else if (n==3){
            System.out.println("Merhaba, aradığınız için teşekkürler");
        }

        else if (n==4){
            System.out.println("Привет, спасибо за ваш звонок");
        }

        else if (n==5){
            System.out.println("Merci, pour votre appel");
        }

        else{
            System.out.println("Please select number 1-5");
        }


    }
}
