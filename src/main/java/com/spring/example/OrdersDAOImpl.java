package com.spring.example;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class OrdersDAOImpl {

    DataSource dataSource;
    org.springframework.jdbc.core.JdbcTemplate jdbcTemplate;
    private Object JdbcTemplate;


    public void setDataSource(DataSource dataSource)
    {
        this.dataSource=dataSource;
        JdbcTemplate=new JdbcTemplate(dataSource);

    }

    public List<Orders> listAllOrders(){
        String sql="select * from Orders";
        return jdbcTemplate.query(sql,new OrdersMapper());

    }
    public void addOrders(){
        String sql="insert into Orders(id,item,description,price)values (?,?,?,?)";
        jdbcTemplate.update("101,burger,fsfbbdngn,10.99");
    }

}
