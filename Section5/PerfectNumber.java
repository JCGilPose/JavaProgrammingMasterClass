public class PerfectNumber {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            System.out.println(i + " : " + isPerfectNumber(i));
        }

    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        else {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }
    }
}
