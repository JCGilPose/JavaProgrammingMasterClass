import java.util.Scanner;

public class SortedArray {
    /*
    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = getIntegers(count);
    }
    */

    public static int[] getIntegers(int arrayLength) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[arrayLength];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int[] arraySorted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arraySorted[i] = array[i];
        }
        int temp = 0;
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < arraySorted.length-1; i++) {
                if (arraySorted[i] < arraySorted[i+1]) {
                    temp = arraySorted[i];
                    arraySorted[i] = arraySorted[i+1];
                    arraySorted[i+1] = temp;
                    unsorted  = true;
                }
            }
        }
        return arraySorted;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
