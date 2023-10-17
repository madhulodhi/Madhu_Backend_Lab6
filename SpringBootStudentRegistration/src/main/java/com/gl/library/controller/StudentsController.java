package com.gl.library.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; // Import RequestMethod
import com.gl.library.service.StudentService;

@Controller
@RequestMapping("/books")
public class StudentsController {
    @Autowired
    StudentService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET) // Use RequestMethod.GET
    public String listBooks(Model model) {
        model.addAttribute("Books", bookService.findAll());
        return "list-books";
    }
}
