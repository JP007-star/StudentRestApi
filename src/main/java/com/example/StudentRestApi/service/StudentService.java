package com.example.StudentRestApi.service;

import com.example.StudentRestApi.entity.Student;
import com.example.StudentRestApi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

     public Student createStudent(String name, String age, String fee){
        Student student =new Student();
        student.setName(name);
        student.setAge(Integer.parseInt(age));
        student.setFee(Double.valueOf(fee));
        repository.save(student);
        return student;
    }

    public List<Student> readAllStudents()
    {
       List<Student> studentList=repository.findAll();
       return studentList;
    }

    public Student updateStudent(Student stud){
         Student student=repository.save(stud);
         return student;
    }

    public void deleteStudent(int id){
         repository.deleteById(id);
    }
}
