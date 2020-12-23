public class SumThreeAndFiveChallenge {

    public static void main(String[] args) {

        sumThreeAndFive();
    }

    public static void sumThreeAndFive() {
        int total = 0;
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                total += i;
                count++;
                System.out.println("Common multiple of 3 and 5: " + i);
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("The sum of the numbers found is: " + total);
    }
}
