public class Task5_5_ConversionFromCToFAndFToC {

   /* Write a program that displays the following
    two tables side by side:
    Celsius Fahrenheit | Fahrenheit Celsius
    0 32.000 | 20 −6.667
    2 35.600 | 25 −3.889
    ...
    98 208.400 | 265 129.444
    100 212.000 | 270 132.222
    */

    public static void main(String[] args) {

        System.out.printf("%-11s%11s%11s%-11s%11s\n", "Celcius", "Fahrenheit", "     |     ", "Fahrenheit", "Celsius");
        int celsius = 0;
        int fahrenheit = 20;
        while (celsius <= 100){
            System.out.printf("%-11d%11.3f%11s%-11d%11.3f\n", celsius, celsius * 9/5.0 + 32, "", fahrenheit, (fahrenheit - 32) * 5.0/9);
            celsius = celsius +2;
            fahrenheit = fahrenheit +5;
        }
    }
}
