public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        pagesPrinted = 0;
        this.duplex = duplex;
        if ((tonerLevel <= -1) || (tonerLevel > 100)) {
            this.tonerLevel = -1;
        }
        else {
            this.tonerLevel = tonerLevel;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if ((tonerAmount <= 0) || (tonerAmount > 100) ||
            (tonerLevel + tonerAmount > 100)) {
            return -1;
        }
        else {
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex) {
            pagesToPrint = ((pagesToPrint / 2) + (pagesToPrint % 2));
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
