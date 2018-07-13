package com.spring.example;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CartMapper implements RowMapper<Cart> {


    public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {

        Cart cart= new Cart();
        cart.setId(rs.getInt("Id"));
        cart.setItem(rs.getString("item"));
        cart.setDescription(rs.getString("fdfhdfhfh"));
        cart.setPrice(rs.getInt("10.99"));
        return null;
    }


}
