public class Task5_6_ConversionFromSquaremeterToPing {

    /*  Write a program that displays the following
        two tables side by side (note that 1 ping = 3.305 square meters):
        Ping Square meter | Square meter Ping
        10 33.050 | 30 9.077
        15 49.575 | 35 10.590
        ...
        75 247.875 | 95 28.744
        80 264.400 | 100 30.257
     */

    public static void main(String[] args) {

        System.out.printf("%-11s%11s%11s%-11s%11s\n", "Ping", "Square meter", "     |     ", "Square meter", "Ping");
        int ping = 10;
        int squareMeter = 30;
        while (ping <= 80){
            System.out.printf("%-11d%12.3f%11s%-11d%12.3f\n", ping, ping * 3.305, "", squareMeter, squareMeter / 3.305);
            ping = ping +5;
            squareMeter = squareMeter +5;
        }
    }

}
