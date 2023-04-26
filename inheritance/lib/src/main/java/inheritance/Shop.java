package inheritance;

public class Shop {
    String name;
    String description;
    String dollarSigns;

    public Shop(String name, String description, String dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dollarSigns='" + dollarSigns + '\'' +
                '}';
    }
}
