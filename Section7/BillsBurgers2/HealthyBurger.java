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
        System.out.println("Added " + healthyExtra1Name +
                           " for an extra " + healthyExtra1Price);
    }

    public void addHealthyAddition2(String healthyAddition2Name,
                                      double healthyAddition2Price) {
        this.healthyExtra2Name = healthyAddition2Name;
        this.healthyExtra2Price = healthyAddition2Price;
        System.out.println("Added " + healthyExtra1Name +
                           " for an extra " + healthyExtra1Price);
    }

    @Override
    public double itemizeHamburger() {
        super.itemizeHamburger();
        setPrice(addUp(getPrice(), healthyExtra1Name, healthyExtra1Price));
        setPrice(addUp(getPrice(), healthyExtra2Name, healthyExtra2Price));
        return getPrice();
    }
}
