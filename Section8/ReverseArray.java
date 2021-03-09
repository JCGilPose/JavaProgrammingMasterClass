import java.util.Arrays;

public class ReverseArray {

    /*public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 11, 9, 15};
        reverse(array);
    }*/

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        int temp = 0;
        for (int i = 0; i < halfLength; i++) {
            temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
