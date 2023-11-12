package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class ProductController {
    @GetMapping("/")
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showHomePage(){
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
}
