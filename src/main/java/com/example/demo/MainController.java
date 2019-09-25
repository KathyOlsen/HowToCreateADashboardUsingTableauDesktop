package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String homePage(){
        return "index";
    }

    @RequestMapping("/prepareData")
    public String prepareData(){
        return "prepareData";
    }

    @RequestMapping("/createPages")
    public String createPages(){
        return "createPages";
    }

    @RequestMapping("/assembleDashboard")
    public String assembleDashboard(){
        return "assembleDashboard";
    }

    @RequestMapping("/dashboardDesign")
    public String dashboardDesign(){
        return "dashboardDesign";
    }

    @RequestMapping("/additionalResources")
    public String additionalResources(){
        return "additionalResources";
    }

    @RequestMapping("/aboutMe")
    public String aboutMe(){
        return "aboutMe";
    }
}
