package com.ay.mapper;

import com.ay.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    /*增加学生*/
    public void addStudent(Student student);

    /*按照ID删除学生*/
    public void delStudent(Integer id);

    /*更新学生*/
    public void updateStudent(Student student);

    /*按照ID查找学生*/
    public Student findStudentByid(Integer id);

    /*查找所有学生*/
    public List<Student> findAllStudent();

}