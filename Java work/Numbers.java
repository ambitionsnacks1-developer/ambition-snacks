import java.util.scanner
public class Numbers{
public static void main(string[]args){
     double Num1,Num2,Num3,Num4,Num5;
     double average;
     Scanner input=new scanner(system.in);

System.out.print("Enter the first number:");
num1=input.nextDouble();
System.out.print("Enter the second number:");
num2=input.nextDouble();
System.out.print("Enter the third number:");
num3=input.nextDouble();
System.out.print("Enter the forth number:");
num4=input.nextDouble();
System.out.print("Enter the fifth number:");
num5 = input.nextDouble();

average =(num1 + num2 + num3 + num4 + num5) / 5;

System.out.printf("Average =%.3f%n", average);
input.close();

        }
    }