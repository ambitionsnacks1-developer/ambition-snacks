 import java.util.scanner;
 public class CarSystem{
    public static void main(String[] args){

        String  Available Car, Functionality;
        double  Price;
        int choice, Quantity;
        scanner input = new Scanner(System.in);

        
        System.out.println("Enter the Available Cars:");
        Available Car = input.nextString();
        System.out.println("Enter Price:");
        Price = input.nextdouble();
        System.out.println("Enter the Choice:");
        Choice = input.nextint();
        System.out.println("Enter the Quantity:");
        Quantity = input.nextint();
        System.out.println("Enter Functionality:");
        Funtionality = input.nextstring();

        System.out.println("\---Car details---");
        System.out.println("Car: " + AvailableCar);
        System.out.println("Price: " + Price);
        System.out.println("choice: " + Choice)
        System.out.println("Quantity: " + Quantity);
        system.outt.println("Functionality:" + Functionality);


        input.close();

        
        
    }
 }