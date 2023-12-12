public class ChocolateTester {
    public static void main(String[] args) {
        // Create an object of chocolate using the default constructor
        Chocolate defaultChocolate = new Chocolate();

        // Use getter methods to display the values
        System.out.println("Default Chocolate Details:");
        displayChocolateDetails(defaultChocolate);

        // Create an object of chocolate using the parameterized constructor
        Chocolate customizedChocolate = new Chocolate(102, "Hershey's", 24, 50);

        // Use getter methods to display the modified values
        System.out.println("\nCustomized Chocolate Details:");
        displayChocolateDetails(customizedChocolate);

        // Use setter methods to modify the values
        customizedChocolate.setBarCode(103);
        customizedChocolate.setName("Ferrero Rocher");
        customizedChocolate.setWeight(30);
        customizedChocolate.setCost(70);

        // Use getter methods to display the modified values
        System.out.println("\nUpdated Chocolate Details:");
        displayChocolateDetails(customizedChocolate);
    }

    private static void displayChocolateDetails(Chocolate chocolate) {
        System.out.println("Bar Code: " + chocolate.getBarCode());
        System.out.println("Name: " + chocolate.getName());
        System.out.println("Weight: " + chocolate.getWeight());
        System.out.println("Cost: " + chocolate.getCost());
        System.out.println();
    }
}