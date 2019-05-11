package com.ay.service;

import com.ay.entity.Student;
import com.ay.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;


    /*增加学生*/
    public void addStudent(Student student) {
        studentMapper.addStudent(student);

    }

    /*按照ID删除学生*/
    public void delStudent(Integer id) {
        studentMapper.delStudent(id);
    }

    /*更新学生*/
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    /*按照ID查找学生*/
    public Student findStudentByid(Integer id) {
        return studentMapper.findStudentByid(id);
    }

    /*查找所有学生*/
    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }
}
