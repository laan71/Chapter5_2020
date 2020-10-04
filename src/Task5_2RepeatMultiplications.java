import java.util.Scanner;

public class Task5_2RepeatMultiplications {


    /* Listing 5.4, SubtractionQuizLoop.java, generates five random
       subtraction questions.
       Revise the program to generate ten random multiplication questions for two integers between 1 and 12.
       Display the correct count and test time */

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10; // Number of questions changed from 5 to 10
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = ""; // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // 1. Generate two random single-digit integers
            int number1 = (int)(Math.random() * 12); // Changed from 10 to 12
            int number2 = (int)(Math.random() * 12); // Changed from 10 to 12

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // 3. Prompt the student to answer "What is number1 * number2?"
            System.out.print(
                    "What is " + number1 + " * " + number2 + "? "); // Subtraction (-) is changed to multiplication (*)
            int answer = input.nextInt();

            // 4. Grade the answer and display the result
            if (number1 * number2 == answer) {    // // Subtraction (-) is changed to multiplication (*)
                System.out.println("You are correct!\n");
                correctCount++; // Increase the correct count
            }
            else
                System.out.println("Your answer is wrong.\n" + number1
                        + " * " + number2 + " should be " + (number1 * number2) + "\n");  // // Subtraction (-) is changed to multiplication (*)

            // Increase the count
            count++;

            output += "\n" + number1 + "*" + number2 + "=" + answer +
                    ((number1 * number2 == answer) ? " correct" : " wrong"); // // Subtraction (-) is changed to multiplication (*)
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                "\n Test time is " + testTime / 1000 + " seconds\n" + output);
    }
}
