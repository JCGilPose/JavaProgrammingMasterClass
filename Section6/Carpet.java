public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0.0) {
            cost = 0.0;
        }
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
