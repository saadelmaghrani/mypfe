package com.saadexamples.saad.services;

import com.saadexamples.saad.models.Student;
import com.saadexamples.saad.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.update(student);
    }

    @Override
    public Student delete(int id) {
        return studentRepository.delete(id);
    }

    @Override
    public List<Student> getAll(Student student) {
        return studentRepository.getAll(student);
    }


}
