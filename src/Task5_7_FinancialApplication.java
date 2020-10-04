public class Task5_7_FinancialApplication {

    /* Compute future tuition - Suppose that the tuition for a university is $10,000 this year and increases 6% every year.
    In one year, the tuition will be $10,600. Write a program that computes the tuition in ten years and the total
    cost of four years’ worth of tuition after the tenth year
    */

    public static void main(String[] args) {

        double totalCost = 0;
        double tuition = 10000;
        double tuition10Years = 0;

        for (int year = 1; year <= 13; year++) {
            tuition += (tuition * 0.06);

        //    System.out.println(tuition);  // This is just to check the cost per year

            if (year >= 10) {
                totalCost += tuition;
            }

            if (year == 10) {
                tuition10Years = tuition;
            }

        }
        System.out.printf("In 10 years the tuition will be $%.2f and the cost for 4 years of tuition is $%.2f", tuition10Years ,totalCost);




    }
}
