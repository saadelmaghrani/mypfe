package com.saadexamples.saad.repositories;

import com.saadexamples.saad.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository{
    Student save(Student student);
    Student update(Student student);
    Student delete(int id);
    List<Student> getAll(Student student);
}
