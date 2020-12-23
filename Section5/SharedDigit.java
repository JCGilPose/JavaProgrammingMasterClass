public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || b < 10 || a > 99 || b > 99) {
            return false;
        }
        else {
            int aTens = a / 10;
            int aUnits = a % 10;
            int bTens = b / 10;
            int bUnits = b % 10;
            return (aTens == bTens || aTens == bUnits ||
                    aUnits == bTens || aUnits == bUnits);
        }
    }
}
