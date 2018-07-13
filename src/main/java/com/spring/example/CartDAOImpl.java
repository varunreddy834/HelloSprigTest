package com.spring.example;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class CartDAOImpl {

    DataSource dataSource;
    org.springframework.jdbc.core.JdbcTemplate jdbcTemplate;
    private Object JdbcTemplate;


    public void setDataSource(DataSource dataSource)
    {
        this.dataSource=dataSource;
        JdbcTemplate=new JdbcTemplate(dataSource);

    }

    public List<Cart> listAllCart(){
        String sql="select * from Cart";
        return jdbcTemplate.query(sql,new CartMapper());

    }
    public void addCart(){
        String sql="insert into Cart(id,item,description,price)values (?,?,?,?)";
        jdbcTemplate.update("101,burger,fsfbbdngn,10.99");
    }
}
