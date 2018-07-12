package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutController {

    private String about;

    @RequestMapping(value = "/About", method = RequestMethod.GET)
    public String About() {
        System.out.println("inside about Controller");
        return "About";

    }


    public void setAbout(String About) {
        about = About;
    }

    public String getAbout() {
        return about;
    }
}
