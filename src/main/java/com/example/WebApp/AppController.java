package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class AppController {

    @Autowired
    private DAO dao;

    // handler methods go here..

    /*
    Return the mapping of the webpages so program can find them
    GetMapping as we are only obtaining the location
     */
    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Successful";

    }

    //Login form
    @RequestMapping("/index.jsp")
    public String login() {
        return "index.jsp";
    }

    //Login form with error
    @RequestMapping("index-error.jsp")
    public String LoginError(Model model){
        model.addAttribute("LoginError", true);
        return "index.jsp";
    }

    @RequestMapping("/")
    public String viewStaffPage(Model model) {
        List<Staff> listStaff = dao.list();
        model.addAttribute("listStaff", listStaff);
        return "Staff";
    }

    //Allowing for A new Staff Member
    @RequestMapping("/new")
    public String showNewForm(Model model) {
        Staff staff = new Staff();
        model.addAttribute("staff", staff);

        return "new_form";
    }

    //Save for new Staff
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("sale") Staff staff) {
        dao.save(staff);
        return "redirect:/";
    }

    //Edit Staff Member
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable(name = "StaffID") int StaffID) {
        ModelAndView mav = new ModelAndView("edit_form");
        Staff staff = dao.get(StaffID);
        mav.addObject("Staff", staff);

        return mav;
    }


}
