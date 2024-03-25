package allowedproducts;

public class Application {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 0.5, 0.3, 19);
        Product chickenBreast = new Product("Chicken Breast", 25.0, 3.6, 0.0, 165);
        Product peanutButter = new Product("Peanut Butter", 7.0, 16.0, 6.0, 188);
        Product rice = new Product("Rice", 2.7, 0.3, 28.0, 130);

        MyProducts myProducts = new MyProducts(50.0, 20.0, 100.0, 500);
        myProducts.addProduct(apple);
        myProducts.addProduct(chickenBreast);
        myProducts.addProduct(peanutButter);
        myProducts.addProduct(rice);

        myProducts.displayProducts();
    }
}
