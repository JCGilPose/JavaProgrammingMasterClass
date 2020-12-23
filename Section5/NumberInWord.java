public class NumberInWord {

    public static void printNumberInWord(int number) {
        String[] numbers = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE",
                            "SIX", "SEVEN", "EIGHT", "NINE"};
        if (number >= 0 && number <= 9) {
            System.out.println(numbers[number]);
        }
        else {
            System.out.println("other");
        }
    }
}
