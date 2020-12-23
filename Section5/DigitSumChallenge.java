public class DigitSumChallenge {

    public static void main(String[] args) {

        System.out.println(sumDigits(10));
        System.out.println(sumDigits(150));
        System.out.println(sumDigits(999));
        System.out.println(sumDigits(1));

    }

    public static int sumDigits(int number) {
        if (number >= 10) {
            int total = 0;
            while (number >= 1) {
                total += (number % 10);
                number /= 10;
            }
            return total;
        }
        else {
            return -1;
        }
    }
}
