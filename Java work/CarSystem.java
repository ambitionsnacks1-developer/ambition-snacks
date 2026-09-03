import java.util.Scanner;

public class CarSystem {
    public static void main(String[] args) {

        String AvailableCar, Functionality;
        double Price;
        int Choice, Quantity;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Available Cars:");
        AvailableCar = input.next();
        System.out.println("Enter Price:");
        Price = input.nextDouble();
        System.out.println("Enter the Choice:");
        Choice = input.nextInt();
        System.out.println("Enter the Quantity:");
        Quantity = input.nextInt();
        System.out.println("Enter Functionality:");
        Functionality = input.next();

        // System.out.println("---Car details/-");
        System.out.println("Car: " + AvailableCar);
        System.out.println("Price: " + Price);
        System.out.println("choice: " + Choice);
        System.out.println("Quantity: " + Quantity);
        System.out.println("Functionality:" + Functionality);

        input.close();

    }
}