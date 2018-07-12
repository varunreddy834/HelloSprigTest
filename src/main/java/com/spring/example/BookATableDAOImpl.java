package com.spring.example;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class BookATableDAOImpl {

    DataSource dataSource;
    JdbcTemplate jdbcTemplate;
    private Object JdbcTemplate;


    public void setDataSource(DataSource dataSource)
    {
        this.dataSource=dataSource;
        JdbcTemplate=new JdbcTemplate(dataSource);

    }

    public List<BookATable>listAllBookATable(){
        String sql="select * from BookATable";
        return jdbcTemplate.query(sql,new BookATableMapper());

    }
    public void addBookATable(){
        String sql="insert into BookATable(id,numberofPeople,date,time)values (?,?,?,?)";
        jdbcTemplate.update("101,12/12/2016,10:18 pm");
    }

}
