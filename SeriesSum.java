import java.util.Scanner;
public class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of test cases
        System.out.print("Enter the number of test cases: ");
        int testCases = scanner.nextInt();

        for (int i = 1; i <= testCases; i++) {
            // Get the value of n for the current test case
            System.out.print("Enter the value of n for case " + i + ": ");
            int n = scanner.nextInt();

            // Initialize variables for series and sum
            String series = "";
            int sum = 0;

            // Create the series and calculate the sum
            for (int j = 1; j <= n; j++) {
                series += j; // Add the current number to the series
                sum += j;    // Add the current number to the sum
                if (j < n) {
                    series += "+"; // Add a "+" after the number (except the last one)
                }
            }

            // Print the result
            System.out.println(series + " = " + sum);
        }

        scanner.close(); // Close the scanner
    }
}

