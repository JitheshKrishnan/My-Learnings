package com.example.DemoSpringJDBC.repo;

import com.example.DemoSpringJDBC.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien a){
        String sql = "insert into alien (id, name, tech) values (?,?,?)";
        int rows = template.update(sql, a.getId(), a.getName(), a.getTech());
        System.out.println(rows + "row/s affected");
    }
    public List<Alien> findAll(){
        String sql = "select * from alien";
        List<Alien> aliens = template.query(sql, (rs, rowNum) -> {
            Alien a = new Alien();
            a.setId(rs.getInt(1));
            a.setName(rs.getString(2));
            a.setTech(rs.getString(3));
            return a;
        });
        return aliens;
    }
}
