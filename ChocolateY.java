+public class Chocolate {
    private int barCode;
    private String name;
    private double weight;
    private double cost;

    // Parameterized Constructor
    public Chocolate(int barCode, String name, double weight, double cost) {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    // Default Constructor
    public Chocolate() {
        this.barCode = 101;
        this.name = "Cadbury";
        this.weight = 12;
        this.cost = 10;
    }

    // Getter methods
    public int getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    // Setter methods
    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}


