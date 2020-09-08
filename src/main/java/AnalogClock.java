import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourHand = scanner.nextInt();

        /*
         *  your code goes here
         */
         int hours = hourHand / 30;
         int mins = hourHand - (hours * 30);
         int minHand = (mins * 2) * 6;
         System.out.print(minHand);
        // closing the scanner object
        scanner.close();
    }
}