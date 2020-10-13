import java.util.Scanner;
import java.util.Arrays;

public class OrderThreeCities {
    
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String firstCity = x.nextLine();
        firstCity = Character.toUpperCase(firstCity.charAt(0)) + firstCity.substring(1);


        System.out.print("Enter the first city: ");
        String secondCity = x.nextLine();
        secondCity = Character.toUpperCase(secondCity.charAt(0)) + secondCity.substring(1);


        System.out.print("Enter the first city: ");
        String thirdCity = x.nextLine();
        thirdCity = Character.toUpperCase(thirdCity.charAt(0)) + thirdCity.substring(1);

        // String cities[] = {firstCity, secondCity, thirdCity};
        String[] cities = {firstCity, secondCity, thirdCity};

        Arrays.sort(cities);

        // System.out.println(Arrays.toString(cities));

        System.out.println("The three cities in a alphabetical order are " + String.join(" ", cities));


        x.close();


    }
}
