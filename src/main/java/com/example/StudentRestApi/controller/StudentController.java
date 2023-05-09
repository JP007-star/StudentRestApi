package com.example.StudentRestApi.controller;

import com.example.StudentRestApi.entity.Student;
import com.example.StudentRestApi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:3000"})
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping("/createStudent")
    public ResponseEntity<?>  createStudent(@RequestParam String name,@RequestParam String age,@RequestParam String fee){
        Student student= service.createStudent(name, age, fee);
        return new  ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/readAllStudents")
    public ResponseEntity<?> readAllStudents(){
        List<Student> studentList=service.readAllStudents();
        return new ResponseEntity<>(studentList,HttpStatus.ACCEPTED);
    }

    @GetMapping("/studentById")
    public ResponseEntity<?> getStudentById(@RequestParam String id){
        Student student=service.getStudentById(Integer.valueOf(id));
        return new ResponseEntity<>(student,HttpStatus.ACCEPTED);
    }

    @PutMapping("/updateStudent")
    public ResponseEntity<?> updateStudent(@RequestBody Student stud){
        System.out.println(stud);
        Student student= service.updateStudent(stud);
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteStudent")
    public  ResponseEntity<?> deleteStudent(@RequestParam String studentId){
        service.deleteStudent(Integer.parseInt(studentId));
        return new ResponseEntity<>("student with id" + studentId+
                " got deleted successfully",HttpStatus.ACCEPTED);
    }

}


// CRUD    --> CREATE READ UPDATE AND DELETE
