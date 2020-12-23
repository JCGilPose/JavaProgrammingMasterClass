public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int n) {
        boolean isPrime = true;
        if (n < 2) {
            return -1;
        }
        else {
            // looking for factors of n
            for (int i = n; i >= 2; i--) {
                if (n % i == 0) {
                    // Let's assume that i is prime for now
                    isPrime = true;
                    // looking for factors of i to check if i is prime
                    for (int j = 2; j <= i/2; j++) {
                        if (i % j == 0) {
                            // i is not actually prime
                            // No need to check further. Just break.
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        // prime factor found! Return and goodbye!
                        return i;
                    }
                }
            }
            // if no prime factors were found
            return -1;
        }
    }
}
