package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    ProductDB db = new ProductDB();
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        db.save(product);
    }

    public List<Product> getAllProducts() {
        products = db.getAll();
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
