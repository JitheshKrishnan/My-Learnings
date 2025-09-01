package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    Connection con = null;

    public ProductDB(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/productdemo", "root", "jithu2580");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void save(Product product) {
        String query = "insert into product (name, type, place, warrenty) values (?,?,?,?)";
        try {
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, product.getName());
            st.setString(2, product.getType());
            st.setString(3, product.getPlace());
            st.setInt(4, product.getWarrenty());
            st.execute();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Product> getAll() {
        String query = "select name, type, place, warrenty from product";
        List<Product> products = new ArrayList<>();
        try{
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setName(rs.getString(1));
                p.setType(rs.getString(2));
                p.setPlace(rs.getString(3));
                p.setWarrenty(rs.getInt(4));
                products.add(p);
            }
        } catch(Exception e){
            System.out.println(e);
        }
        return products;
    }
}
