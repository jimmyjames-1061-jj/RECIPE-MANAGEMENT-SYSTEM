public class Ingredient {
    private String name;
    private double quantity;
    public Ingredient(String name, double quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}