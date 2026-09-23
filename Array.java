
public class Array {
    public static void main(String[] args) {
        int[] marks = { 70, 80, 65, 90, 85 };
        double average;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];

        }
        average = sum / 5;
        System.err.printf("Average=%.2f%n", average);

    }
}