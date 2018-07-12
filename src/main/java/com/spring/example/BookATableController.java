package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookATableController {
    @RequestMapping(value = "/BookATable", method = RequestMethod.GET)
    public String BookATable() {
        System.out.println("inside BookATable Controller");
        return "BookATable";

    }
}
