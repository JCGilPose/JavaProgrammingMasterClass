public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        String n = String.valueOf(number);
        if (number < 0) {
            n = n.substring(1);
        }
        int l = n.length();
        for (int i = 0; i < l; i++) {
            if (!(n.charAt(i) == n.charAt(l - (i+1)))) {
                return false;
            }
        }
        return true;
    }
}
