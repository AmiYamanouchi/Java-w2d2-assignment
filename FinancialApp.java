
import java.util.Scanner;


public class FinancialApp {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Enter employee's name : ");
        String name = x.nextLine();
        name = Character.toUpperCase(name.charAt(0)) + name.substring(1,name.length());

        System.out.print("Enter number of hours worked in a week: ");
        int hours = x.nextInt();

        System.out.print("Enter hourly pay rate : ");
        double payRate = x.nextDouble();

        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = x.nextDouble();

        System.out.print("Enter state tax withholding rate: ");
        double stateTax = x.nextDouble();

        final double grossPay = hours * payRate;
        final double fedWithholding = Math.floor(grossPay * federalTax);
        final double stateWithholding = Math.floor(grossPay * stateTax);
        final double totalDeduction = fedWithholding + stateWithholding;
        final double netPay = grossPay - totalDeduction;


        System.out.println("employee's name:  " + name);
        System.out.println("hours worked:  " + hours);
        System.out.println("pay rate:  " + "$" + payRate);
        System.out.println("Gross Pay:  " + "$" + grossPay);
        System.out.println("Deductions: ");
        System.out.println("  Federal withholding" + "(" + (federalTax * 100) + "%" + "):  " + "$" + fedWithholding);
        System.out.println("  State withholding" + "(" + (stateTax * 100) + "%" + "):  " + "$" + stateWithholding);
        System.out.println("  Total Deduction:  " + "$" + totalDeduction);
        System.out.println("Net Pay:  " + "$" + netPay);


        x.close();
    }

    
    
}
