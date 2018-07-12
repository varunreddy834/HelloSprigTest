package com.spring.example;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookATableMapper implements RowMapper<BookATable> {



    public BookATable mapRow(ResultSet rs, int rowNum) throws SQLException {

        BookATable bookATable=new BookATable();
        bookATable.setNumberofPeople(rs.getInt("numberofpeople"));
        bookATable.setDate(rs.getDate("date"));
        bookATable.setTime(rs.getTime("time"));
        return null;
    }
}
