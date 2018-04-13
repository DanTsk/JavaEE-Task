package com.mycompany.controllers;

import com.mycompany.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @Autowired
    private StudentService studentsService;

    @RequestMapping({"/admin"})
    public String workWithStudents(Model model){
        model.addAttribute("mainText","Admin part of work with students");
        model.addAttribute("studentsList",studentsService.getAllStudents());
        return "/admin/main";
    }



}
