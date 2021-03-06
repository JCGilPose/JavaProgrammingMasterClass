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
    }

    public void addHamburgerAddition1(String addition1Name,
                                      double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        price += this.addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name,
                                      double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        price += this.addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name,
                                      double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        price += this.addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name,
                                      double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        price += this.addition4Price;
    }

    public double itemizeHamburger() {
        System.out.println(name + " hamburger on a " + breadRollType +
                           " roll with " + meat + ", price is " + price);
        if (addition1Name != null) {
            System.out.println("Added " + addition1Name +
                               " for an extra " + addition1Price);
        }
        if (addition2Name != null) {
            System.out.println("Added " + addition2Name +
                               " for an extra " + addition2Price);
        }
        if (addition3Name != null) {
            System.out.println("Added " + addition3Name +
                               " for an extra " + addition3Price);
        }
        if (addition4Name != null) {
            System.out.println("Added " + addition4Name +
                               " for an extra " + addition4Price);
        }
        return price;
    }
}
