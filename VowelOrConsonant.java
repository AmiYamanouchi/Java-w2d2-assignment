import java.util.Scanner;

/**
 * VowelOrConsonant
 */
public class VowelOrConsonant {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String answer;

        System.out.println("enter a letter");

        answer = x.next();

        char charAnswer = answer.charAt(0);

        System.out.println(charAnswer);


        if((charAnswer >= 'a' && charAnswer <= 'z') || (charAnswer>= 'A' && charAnswer <= 'Z')){

            if(charAnswer == 'a' || charAnswer == 'i' || charAnswer == 'u' || charAnswer== 'e' || charAnswer== 'o'|| charAnswer == 'A' || charAnswer == 'I' || charAnswer == 'U' || charAnswer== 'E' || charAnswer== 'O') {
                System.out.println("the letter" + answer + "is Vowel");
            }else {
                System.out.println("the letter" + answer + "is Consonant");
            }
        } else {
            System.out.println(answer + " is not alphabet.");
        }

        x.close();
        
    }
}