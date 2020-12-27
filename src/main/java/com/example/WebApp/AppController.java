package com.example.WebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private StaffServices dao;
    @Autowired
    private AnimalServices repo;
    @Autowired
    private SpeciesServices services;


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

    //Viewing All animals
    @RequestMapping("/AnimalView")
    public String viewAnimalPage(Model model) {
        List<animalInfo> listAnimal = repo.listAll();
        model.addAttribute("listAnimal", listAnimal);
        return "AnimalView";
    }

    //View All Species Information
    @RequestMapping("/AnimalView")
    public String viewSpeciePage(Model model) {
        List<SpeciesInfo> listSpecies = services.listAll();
        model.addAttribute("listSpecies", listSpecies);
        return "AnimalView";
    }

    //Allowing for A new Staff Member
    @RequestMapping("/new")
    public String showNewForm(Model model) {
        Staff staff = new Staff();
        model.addAttribute("Staff", staff);

        return "StaffReg";
    }

    //Allowing for a new Animal
    @RequestMapping("/AnimalReg")
    public String showNewAnimal(Model model) {
        animalInfo info = new animalInfo();
        model.addAttribute("animalInfo", info);

        return "AnimalReg";
    }

    //Save for new Staff
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStaff(@ModelAttribute("Staff") Staff staff) {
        dao.save(staff);

        return "redirect:/";
    }

    //Save for new Animal
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String saveAnimal(@ModelAttribute("animalInfo") animalInfo info) {
        repo.save(info);

        return "redirect:/";
    }

    //Save for new Species
    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String SaveSpecies(@ModelAttribute("SpeciesInfo") SpeciesInfo speciesInfo) {
        services.save(speciesInfo);

        return "redirect:/";
    }


    //Edit Staff Member
    @RequestMapping("/edit/{staffID}")
    public ModelAndView showEditForm(@PathVariable(name = "staffID") int staffID) {
        ModelAndView mav = new ModelAndView("StaffEdit");
        Staff staff = dao.get(staffID);
        mav.addObject("Staff", staff);

        return mav;
    }

    //Edit Animal Member
    @RequestMapping("/edit/{animalID}")
    public ModelAndView showAnimalEdit(@PathVariable(name = "animalID") int animalID) {
        ModelAndView mav = new ModelAndView("AnimalEdit");
        animalInfo info = repo.get(animalID);
        mav.addObject("animalInfo", info);

        return mav;
    }

    //Edit Species Member
    @RequestMapping("/edit/{animalID}")
    public ModelAndView showSpecieEdit(@PathVariable(name = "SpecId") int SpecID) {
        ModelAndView mav = new ModelAndView("SpeciesEdit");
        SpeciesInfo speciesInfo = services.get(SpecID);
        mav.addObject("SpeciesInfo", speciesInfo);

        return mav;
    }


    //Delete Staff Member
    @RequestMapping("/delete/{staffID}")
    public String delete(@PathVariable(name = "staffID") int StaffID) {
        dao.delete(StaffID);
        return "redirect:/";
    }

    //Delete Animal Member
    @RequestMapping("/delete/{animalID}")
    public String deleteAnimal(@PathVariable(name = "animalID") int animalID) {
        repo.delete(animalID);
        return "redirect:/";
    }

    //Delete Species Member
    @RequestMapping("/delete/{SpecId}")
    public String deleteSpecies(@PathVariable(name = "SpecId") int SpecId) {
        services.delete(SpecId);
        return "redirect:/";
    }

}
