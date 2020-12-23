import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        System.out.print("Please enter the numbers to be averaged, ");
        System.out.println("one at a time.");
        System.out.println("Enter a nonnumerical character to exit.");
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = true;
        int theSum = 0;
        int counter = 0;
        long theAverage = 0L;
        boolean keepGoing = true;

        while (keepGoing) {
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                theSum += scanner.nextInt();
                ++counter;
                scanner.nextLine();
            }
            else {
                if (counter == 0) {
                    System.out.println("SUM = " + theSum + " AVG = " + theSum);
                    keepGoing = false;
                }
                else {
                    theAverage = Math.round((double)theSum / counter);
                    System.out.println("SUM = " + theSum + " AVG = " + theAverage);
                    keepGoing = false;
                }
            }
        }
        scanner.close();
    }
}
