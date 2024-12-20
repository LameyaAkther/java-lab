import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MathPuzzleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = "questions.txt";
        String outputFilePath = "scores.txt";

        System.out.println("Welcome to the Math Puzzle Game!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        int score = 0;

        try {
            File inputFile = new File(inputFilePath);
            Scanner fileScanner = new Scanner(inputFile);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" ");
                int operand1 = Integer.parseInt(parts[0]);
                String operator = parts[1];
                int operand2 = Integer.parseInt(parts[2]);
                int correctAnswer = calculateAnswer(operand1, operator, operand2);

                System.out.print("What is " + operand1 + " " + operator + " " + operand2 + "? ");
                int playerAnswer = scanner.nextInt();

                if (playerAnswer == correctAnswer) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer is " + correctAnswer);
                }
            }

            fileScanner.close();

            FileWriter writer = new FileWriter(outputFilePath, true);
            writer.write(playerName + ": " + score + "\n");
            writer.close();

            System.out.println("Game Over! Your score: " + score);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int calculateAnswer(int operand1, String operator, int operand2) {
        switch (operator) {
            case "+": return operand1 + operand2;
            case "-": return operand1 - operand2;
            case "*": return operand1 * operand2;
            case "/": return operand2 != 0 ? operand1 / operand2 : 0;
            default: return 0;
        }
    }
}
    