package com.saadexamples.saad.controllers;

import com.saadexamples.saad.models.Student;
import com.saadexamples.saad.services.StudentService;
import com.saadexamples.saad.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    //@Autowird hadi tariqa lewla w tariqa tania hya dir constructor
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public Student add(Student student){
        return studentService.save(student);
    }
    @GetMapping(("/allstudents"))
    public List<Student> getAll(Student student){
        return studentService.getAll(student);
    }
    @PutMapping
    public Student update(Student student){
        return studentService.update(student);
    }
    @DeleteMapping
    public Student delete(int id){
        return studentService.delete(id);
    }

}
