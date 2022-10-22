import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double billTotal;
        double tipPercent;
        int amountOfPeople;
        double tipAmount;
        double total;
        // boolean splitting;
        // -------------------Input----------------------//

        Scanner value = new Scanner(System.in);

        System.out.println("Enter the total of your bill? ");
        billTotal = value.nextDouble();
        System.out.println("Enter the percent you want to tip");
        tipPercent = value.nextDouble();
        System.out.println("How many ways are we splitting the bill?");
        amountOfPeople = value.nextInt();

        tipAmount = billTotal * (tipPercent / 100);
        total = tipAmount + billTotal;
        System.out.printf("Your total is: %.2f", total);

        value.close();

    }
}
