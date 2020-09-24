public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour = -1L; // Will return -1 if value is smaller than zero
        if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
        }
        return milesPerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour >= 0) {
        System.out.println(kilometersPerHour + " km/h = " +
                           milesPerHour + " mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }
    }
}
