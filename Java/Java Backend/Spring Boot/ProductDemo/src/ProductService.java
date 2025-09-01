import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product){
        this.products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductByName(String name) {
        for(Product product: products){
            if(product.getName().equals(name))
                return product;
        }
        return null;
    }

    public List<Product> getProductsByText(String text) {
        text = text.toLowerCase();
        List<Product> prods = new ArrayList<>();
        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(text) || type.contains(text) || place.contains(text))
                prods.add(p);
        }
        return prods;
    }
}
