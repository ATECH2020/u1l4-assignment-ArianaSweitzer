import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        /*
         *  your code goes here
         */
         class1 = (class1 / 2) + (class1 % 2);
         class2 = (class2 / 2) + (class2 % 2);
         class3 = (class3 / 2) + (class3 % 2);
         System.out.print(class1 + class2 + class3);

        // closing the scanner object
        scanner.close();
    }
}