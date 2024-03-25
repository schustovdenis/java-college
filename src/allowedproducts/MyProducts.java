package allowedproducts;

public class MyProducts {
    private double maxProteins;
    private double maxFats;
    private double maxCarbohydrates;
    private int maxCalories;
    private Product[] products;

    public MyProducts(double maxProteins, double maxFats, double maxCarbohydrates, int maxCalories) {
        this.maxProteins = maxProteins;
        this.maxFats = maxFats;
        this.maxCarbohydrates = maxCarbohydrates;
        this.maxCalories = maxCalories;
        products = new Product[10];
    }

    public void addProduct(Product product) {
        if (product.getProteins() > maxProteins) {
            System.out.println("Product cannot be added. Too high protein content.");
            return;
        }
        if (product.getFats() > maxFats) {
            System.out.println("Product cannot be added. Too high fat content.");
            return;
        }
        if (product.getCarbohydrates() > maxCarbohydrates) {
            System.out.println("Product cannot be added. Too high carbohydrate content.");
            return;
        }
        if (product.getCalories() > maxCalories) {
            System.out.println("Product cannot be added. Too high calorie content.");
            return;
        }
        for (int i = 0; i < products.length; i+= 1) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
    }

    public void displayProducts() {
        int x = 0;
        while (products[x] != null) {
            System.out.println(products[x].getName());
            x++;
        }
    }

}
