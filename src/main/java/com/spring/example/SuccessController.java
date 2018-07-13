package com.spring.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SuccessController {

    @RequestMapping(value = "/Success", method = RequestMethod.GET)
    public String Success() {
        System.out.println("inside Success Controller");
        return "Success";

    }
}
