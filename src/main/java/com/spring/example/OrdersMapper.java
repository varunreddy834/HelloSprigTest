package com.spring.example;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdersMapper implements RowMapper<Orders> {
public Orders mapRow(ResultSet rs, int rowNum)throws SQLException {

        Orders orders=new Orders();
        orders.setId(rs.getInt("Id"));
        orders.setItem(rs.getString("item"));
        orders.setDescription(rs.getString("fdfhdfhfh"));
        orders.setPrice(rs.getInt("10.99"));
        return null;
        }


}
