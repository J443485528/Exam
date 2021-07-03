package com.xxxx.service;
import com.xxxx.domian.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    /*查询*/
    List<Student> selectStudent();
    /*查询学生通过学号*/
    Student selectStudentByNumber(String number);
    /*查询学生通过姓名*/
    Student selectStudentByName(String name);
    /*插入*/
    int insertStudent(Student student);
    /*修改*/
    int updataStudent(Student student);
    /*删除学生通过学号*/
    int deleteStudentByNumber(String number);


}
