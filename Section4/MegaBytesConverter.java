public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes >= 0) {
            int megaBytes = kiloBytes / 1024;
            int remainderKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " +
                           remainderKB + " KB");
        }
        else {
            System.out.println("Invalid Value");
        }
    }
}
