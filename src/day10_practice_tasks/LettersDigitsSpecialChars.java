package day10_practice_tasks;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String letters = "";
        String digits = "";
        String specialChar = "";

        for (char ch : str.toCharArray()) {

            if (Character.isDigit(ch)){
                digits += ch;
            } else if (Character.isLetter(ch)) {
                letters += ch;
            }else{
                specialChar+=ch;
            }
        }
        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);
    }
}
