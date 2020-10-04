public class Task5_4_ConversionFromInchToCentimeter {

    /*  Write a program that displays the following
        table (note that 1 inch is 2.54 centimeters):
        Inches Centimetres
        1 2.54
        2 5.08
        ...
        9 22.86
        10 25.4
     */

    public static void main(String[] args) {

        System.out.printf("%-12s%-12s\n", "Inches", "Centimeter");
        int centimeters = 1;
        while (centimeters <= 10){
            System.out.printf("%-12d%-12.2f\n", centimeters, centimeters * 2.54);
            centimeters++;
        }
    }
}
