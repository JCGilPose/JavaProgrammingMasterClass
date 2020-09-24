public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {
        // Testing the functions
        System.out.println(getDurationString(60, 59));
        System.out.println(getDurationString(361, 451));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(-3));
        System.out.println(getDurationString(3669));
        System.out.println(getDurationString(3945));
    }

    // The function with 2 parameters and the nice printing
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int hours = (minutes / 60);
        minutes %= 60;

        String hourString = "";
        String minuteString = "";
        String secondString = "";

        if (hours < 10) {
            hourString += ("0" + hours);
        }
        else {
            hourString += hours;
        }

        if (minutes < 10) {
            minuteString += ("0" + minutes);
        }
        else {
            minuteString += minutes;
        }

        if (seconds < 10) {
            secondString += ("0" + seconds);
        }
        else {
            secondString += seconds;
        }

        return (hourString + "h " + minuteString + "m " + secondString + "s");
    }

    // The function with one parameter and that uses the previous function
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60;
        seconds %= 60;

        return getDurationString(minutes, seconds);
    }
}
