import java.util.Scanner;

public class MinimumElement {

    /*public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        System.out.println(findMin(array));
    }*/

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int arrayLength) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int value = 0;

        for (int i = 0; i < array.length; i++) {
            value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
