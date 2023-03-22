package com.saadexamples.saad.repositories;

import com.saadexamples.saad.models.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository{
    @Override
    public Student save(Student student) {
        //"insert into saad values "
        return null;
    }

    @Override
    public Student update(Student student) {
        //update saad set
        return null;
    }

    @Override
    public Student delete(int id) {
        //delete from saad
        return null;
    }

    @Override
    public List<Student> getAll(Student student) {
        //select * from student
        return null;
    }
}
