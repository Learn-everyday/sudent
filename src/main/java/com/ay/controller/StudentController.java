package com.ay.controller;

import com.ay.entity.Student;
import com.ay.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /*查找所有学生*/
    @RequestMapping("/findAllStudent")
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }

    /*增加学生*/
    @RequestMapping("/addStudent")
    public void addStudent(Student student){
        studentService.addStudent(student);
    }

    /*按照ID删除学生*/
    @RequestMapping("/delStudent")
    public void delStudent(Integer id){
        studentService.delStudent(id);
    }

    /*更新学生*/
    @RequestMapping("/updateStudent")
    public void updateStudent(Student student){
        studentService.updateStudent(student);
    }

    /*按照ID查找学生*/
    @RequestMapping("/findStudentByid")
    public Student findStudentByid(Integer id){
        return studentService.findStudentByid(id);
    }



}
