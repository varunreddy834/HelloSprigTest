package com.spring.example;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class BookATableDAOImpl {

    DataSource dataSource;
    JdbcTemplate jdbcTemplate;
  // private Object JdbcTemplate;


    public void setDataSource(DataSource dataSource)
    {
        this.dataSource=dataSource;
        jdbcTemplate=new JdbcTemplate(dataSource);

    }

    public List<BookATable>listAllBookATable(){
        String sql="select * from BookATable";
        return jdbcTemplate.query(sql,new BookATableMapper());

    }
    public void addBookATable(){
        String sql="insert into BookATable(id,numberofPeople,date,time) values (?,?,?,?)";
        jdbcTemplate.update(sql,"101","6","11/11/2016","10:18pm");
    }

}
