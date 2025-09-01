package com.example.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;
//    public void addProduct(Product product){
//        db.save(product);
//    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

//    public Product getProductByName(String name) {
//        for(Product product: products){
//            if(product.getName().equals(name))
//                return product;
//        }
//        return null;
//    }
}
