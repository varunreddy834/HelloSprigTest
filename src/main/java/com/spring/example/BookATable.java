package com.spring.example;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.util.Date;
@Entity
@Table(name="BookATable")
public class BookATable {
    @Id
    int id;

    private int numberofPeople;
    private Date date;
    private Time time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberofPeople() {
        return numberofPeople;
    }

    public void setNumberofPeople(int numberofPeople) {
        this.numberofPeople = numberofPeople;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}