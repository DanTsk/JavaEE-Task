package com.mycompany.controllers;

import com.mycompany.data.Student;
import com.mycompany.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


@Controller
@RequestMapping("/student")
public class RestController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value="/{id}", method= RequestMethod.GET, headers = {"Accept=text/xml, application/json"})
    public @ResponseBody Student getSpittle(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @RequestMapping(value="/save", method= RequestMethod.POST, headers = {"Accept=text/xml, application/json"})
    public @ResponseBody Boolean getSpittle(@PathVariable("id") int id, @Valid Student student) {
        try {
            studentService.saveStudent(student);
            return true;
        }catch (Error error){
            return  false;
        }
    }


}

