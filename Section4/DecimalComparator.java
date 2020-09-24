public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        a *= 1000;
        b *= 1000;
        int aInt = (int) a;
        int bInt = (int) b;
        return aInt == bInt;
    }
}
