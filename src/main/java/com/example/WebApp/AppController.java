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

    //View Page for viewing staff members
    @RequestMapping("/")
    public String viewStaffPage(Model model) {
        List<Staff> listStaff = dao.listAll();
        model.addAttribute("listStaff", listStaff);
        return "index";
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
    public String save(@ModelAttribute("Staff") Staff staff) {
        dao.save(staff);
        return "redirect:/";
    }

    //Edit Staff Member
    @RequestMapping("/edit/{staffID}")
    public ModelAndView showEditForm(@PathVariable(name = "staffID") int staffID) {
        ModelAndView mav = new ModelAndView("EditStaff");
        Staff staff = dao.get(staffID);
        mav.addObject("Staff", staff);

        return mav;
    }

    //Update the Staff Member
    /*@RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("Staff") Staff staff) {
        dao.update(staff);

        return "redirect:/";
    }*/

    @RequestMapping("/delete/{staffID}")
    public String delete(@PathVariable(name = "staffID") int StaffID) {
        dao.delete(StaffID);
        return "redirect:/";
    }

}
