import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        int hours;
        int minutes;
        int seconds;


        /*
         *  your code goes here
         */
        hours = hours2 - hours1;
        minutes = minutes2 - minutes1;
        seconds = seconds2 - seconds1;
        hours = hours * 3600;
        minutes = minutes * 60;
        System.out.print(hours + minutes + seconds);


        // closing the scanner object
        scanner.close();
    }
}