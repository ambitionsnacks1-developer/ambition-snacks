public class Numbers2 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        int sum = number1 + number2;
        System.out.println("sum:" + sum);

        int difference = number1 - number2;
        System.out.println("Difference: " + difference);

        int product = number1 * number2;
        System.out.println("Product: " + product);

        if (number2 != 0) {
            int quotient = number1 / number2;
            System.out.println("Quotient: " + quotient);

            int remainder = number1 % number2;
            System.out.println("Remainder: " + remainder);
        }
    }
}