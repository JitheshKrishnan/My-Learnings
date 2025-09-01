import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductService();

        productService.addProduct(new Product("Asus Vivibook", "Laptop", "Brown Table", 2025));
        productService.addProduct(new Product("Lenovo Thinkpad", "Laptop", "Black Table", 2025));
        productService.addProduct(new Product("Lenovo Yoga", "Laptop", "Brown Table", 2024));
        productService.addProduct(new Product("Macbook Pro", "Laptop", "White Table", 2022));
        productService.addProduct(new Product("Oppo A3X", "Phone", "Brown Table", 2025));
        productService.addProduct(new Product("Toad One", "Mouse", "Black Table", 2021));

        List<Product> products = productService.getAllProducts();
        System.out.println("\n====================================================================");
        System.out.println("Print All Products");
        for(Product product : products){
            System.out.println(product);
        }

        System.out.println("\n====================================================================");
        System.out.println("Print Particular Product By Name");
        System.out.println(productService.getProductByName("Tod One"));

        System.out.println("\n====================================================================");
        System.out.println("Print Products By Text");
        List<Product> prods = productService.getProductsByText("brown");
        for(Product p : prods){
            System.out.println(p);
        }

    }
}