import java.util.Scanner;

public class Task5_1_PassOrFail {


    /* ) Write a program that prompts a student to enter a Java score. If the
        score is greater or equal to 60, display “you pass the exam”; otherwise, display “you
        don’t pass the exam”. Your program ends with input -1 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your score! ");
        int score = 0;
        while (score != -1) {
            score = scanner.nextInt();
            if (score >= 60)
                System.out.println("You pass the exam");
            else if (score == -1) {
                System.out.println("Thank you for enter your score!");
            }
            else {
                System.out.println("You don´t pass the exam");
            }
        }
    }
}
