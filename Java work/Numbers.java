import java.util.Scanner;

public class Numbers {
     public static void main(String[] args) {
          double Num1, Num2, Num3, Num4, Num5;
          double average;
          Scanner input = new Scanner(System.in);

          System.out.print("Enter the first number:");
          Num1 = input.nextDouble();
          System.out.print("Enter the second number:");
          Num2 = input.nextDouble();
          System.out.print("Enter the third number:");
          Num3 = input.nextDouble();
          System.out.print("Enter the forth number:");
          Num4 = input.nextDouble();
          System.out.print("Enter the fifth number:");
          Num5 = input.nextDouble();

          average = (Num1 + Num2 + Num3 + Num4 + Num5) / 5;

          System.out.printf("Average =%.3f%n", average);
          input.close();

     }
}