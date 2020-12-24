package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    /*
    Return the mapping of the webpages so program can find them
    GetMapping as we are only obtaining the location
     */
    @GetMapping("/")
    public String Root() {
        return "index.jsp";
    }

    @GetMapping("/login")
    public String Login(Model model){
        return "/login.jsp";
    }

    @GetMapping("/animal")
    public String Animal(){
        return "/animal.jsp";
    }

    @GetMapping("/animalView")
    public String AnimalView(){
        return "/animalView.jsp";
    }

    @GetMapping("/staff")
    public String User(){
        return "/user.jsp";
    }

}
