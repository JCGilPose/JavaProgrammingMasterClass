public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println();
        System.out.println(reverse(-2521));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println(reverse(102030405));
        System.out.println();
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int reversed = reverse(number);
            int digits = getDigitCount(number);
            String[] words = {"Zero", "One", "Two", "Three", "Four", "Five",
                              "Six", "Seven", "Eight", "Nine", "Ten"};
            while (reversed >= 10) {
                System.out.print(words[reversed % 10] + " ");
                reversed /= 10;
                digits--;
            }
            System.out.print(words[reversed] + " ");
            digits--;
            while (digits > 0) {
                System.out.print(words[0] + " ");
                digits--;
            }
            System.out.println();
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        boolean neg = number < 0;
        if (neg) {
            number = 0 - number;
        }
        while (number >= 10) {
            reversed += number % 10;
            number /= 10;
            reversed *= 10;
        }
        reversed += number;
        if (neg) {
            reversed = 0 - reversed;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }
        else {
            while (number >= 10) {
                number /= 10;
                count++;
            }
            count++;
            return count;
        }
    }
}
