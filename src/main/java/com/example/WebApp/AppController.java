package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
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

    //View Page for viewing staff members
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

        return "StaffForm";
    }

    //Save for new Staff
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("sale") Staff staff) {
        dao.save(staff);
        return "redirect:/";
    }

    //Edit Staff Member
    @RequestMapping("/edit/{StaffID}")
    public ModelAndView showEditForm(@PathVariable(name = "StaffID") int StaffID) {
        ModelAndView mav = new ModelAndView("EditStaff");
        Staff staff = dao.get(StaffID);
        mav.addObject("Staff", staff);

        return mav;
    }

    //Update the Staff Member
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("Staff") Staff staff) {
        dao.update(staff);

        return "redirect:/";
    }

    @RequestMapping("/delete/{StaffID}")
    public String delete(@PathVariable(name = "StaffID") int StaffID) {
        dao.delete(StaffID);
        return "redirect:/";
    }

}
