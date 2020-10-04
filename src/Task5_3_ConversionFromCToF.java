public class Task5_3_ConversionFromCToF  {

    /* º) Write a program that displays the following table (note
          that farenheit = celsius * 9/5 + 32):
          Celsius Fahrenheit
          0 32.0
          2 35.6
          ...
         98 208.4
         100 212.0
     */

    public static void main(String[] args) {

        System.out.printf("%-15s%15s\n", "Celcius", "Fahrenheit");
        int celsius = 0;
        while (celsius <= 100){
            System.out.printf("%-15d%15.1f\n", celsius, celsius * 9/5.0 + 32);
            celsius = celsius+2;  // If we want the table to show all the degrees we can change the +2 to +1 and if we remove the +2 we get an infinity loop just shoving 0 C 32,0 F
        }
    }
}


