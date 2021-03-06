public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String healthyAddition1Name,
                                    double healthyAddition1Price) {
        this.healthyExtra1Name = healthyAddition1Name;
        this.healthyExtra1Price = healthyAddition1Price;
    }

    public void addHealthyAddition2(String healthyAddition2Name,
                                    double healthyAddition2Price) {
        this.healthyExtra2Name = healthyAddition2Name;
        this.healthyExtra2Price = healthyAddition2Price;

    }

    @Override
    public double itemizeHamburger() {
        double price = super.itemizeHamburger();
        if (healthyExtra1Name != null) {
            System.out.println("Added " + healthyExtra1Name +
                               " for an extra " + healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            System.out.println("Added " + healthyExtra1Name +
                               " for an extra " + healthyExtra1Price);
        }
        return price + healthyExtra1Price + healthyExtra2Price;
    }
}
