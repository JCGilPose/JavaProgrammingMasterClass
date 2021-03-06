public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat,
                     double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name + " hamburger on a " + breadRollType +
                           " roll with " + meat + ", price is " + this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void addHamburgerAddition1(String addition1Name,
                                      double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        System.out.println("Added " + addition1Name +
                           " for an extra " + addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name,
                                      double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        System.out.println("Added " + addition2Name +
                           " for an extra " + addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name,
                                      double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        System.out.println("Added " + addition3Name +
                           " for an extra " + addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name,
                                      double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        System.out.println("Added " + addition1Name +
                           " for an extra " + addition1Price);
    }

    public double addUp(double total, String addOnName, double addOnPrice) {
        if (addOnName != null) {
            if (addOnPrice != 0.0) {
                total += addOnPrice;
            }
        }
        return total;
    }

    public double itemizeHamburger() {
        price = addUp(price, addition1Name, addition1Price);
        price = addUp(price, addition2Name, addition2Price);
        price = addUp(price, addition3Name, addition3Price);
        price = addUp(price, addition4Name, addition4Price);
        return price;
    }
}
