package com.spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");

        BookATableDAOImpl bookATableDAOImpl=(BookATableDAOImpl) applicationContext.getBean("BookATable");
        bookATableDAOImpl.addBookATable();

        bookATableDAOImpl.listAllBookATable();
        System.out.println(bookATableDAOImpl);
        ((ClassPathXmlApplicationContext)applicationContext).registerShutdownHook();
    }
}
