package allowedproducts;

public class Product {
    private String name;
    private double proteins;
    private double fats;
    private double carbohydrates;
    private int calories;

    public Product() {
        this.name = "Unknown";
        this.proteins = 0.0;
        this.fats = 0.0;
        this.carbohydrates = 0.0;
        this.calories = 0;
    }
    public Product(String name, double proteins, double fats, double carbohydrates, int calories) {
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public Product(String name, double proteins, double fats, double carbohydrates) {
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = (int) (proteins * 4 + fats * 9 + carbohydrates * 4);
    }

    public Product(String name, double proteins, double fats) {
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = 0.0;
        this.calories = (int) (proteins * 4 + fats * 9);
    }

    public String getName() {
        return name;
    }

    public double getProteins() {
        return proteins;
    }

    public double getFats() {
        return fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public int getCalories() {
        return calories;
    }
}
