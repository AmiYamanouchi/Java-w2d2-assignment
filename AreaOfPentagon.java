import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Enter the length from the center to a vertex: ");

        double length = x.nextInt();

        double s = 2 * length * Math.sin(Math.PI / 5);
        double area = Math.floor(5 * Math.pow(s, 2) / 4 * Math.tan(Math.PI / 5));



        System.out.println("The area of the pentagon is " + area);
        
    }
}
