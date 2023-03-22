package com.saadexamples.saad.services;

import com.saadexamples.saad.models.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);
    Student update(Student student);
    Student delete(int id);
    List<Student> getAll(Student student);
}
