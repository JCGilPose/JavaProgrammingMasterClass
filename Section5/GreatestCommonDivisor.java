public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int gcd = -1;
        if (first < 10 || second < 10) {
            return gcd;
        }
        else {
            if (first <= second) {
                for (int i = first; first >= 1; i--) {
                    if (first % i == 0 && second % i == 0) {
                        gcd = i;
                        break;
                    }
                }
            }
            else {
                for (int i = second; i >= 1; i--) {
                    if (first % i == 0 && second % i == 0) {
                        gcd = i;
                        break;
                    }
                }
            }
        }
        return gcd;
    }
}
