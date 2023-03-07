package HomeWork;

import java.util.Scanner;

public class UserMainMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter previous reading: ");
        int previousReading = scanner.nextInt();
        System.out.print("Enter current reading: ");
        int currentReading = scanner.nextInt();
        System.out.print("Enter the cost per unit: ");
        int costPerUnit = scanner.nextInt();

        int bill = UserMainCode.calculateElectricityBill(previousReading, currentReading, costPerUnit);
        System.out.println("Current bill: " + bill);
    }
}

class UserMainCode {
    public static int calculateElectricityBill(int previousReading, int currentReading, int costPerUnit) {
        int unitsConsumed = currentReading - previousReading;
        int billAmount = unitsConsumed * costPerUnit;
        return billAmount;
    }
}
