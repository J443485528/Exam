package com.xxxx.service.Impl;

import com.xxxx.dao.StudentDao;
import com.xxxx.domian.Student;
import com.xxxx.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public List<Student> selectStudent() {
        List<Student> students = studentDao.selectStudent();
        return students;
    }

    @Override
    public Student selectStudentByNumber(String number) {
        Student student = studentDao.selectStudentByNumber(number);
        return student;
    }

    @Override
    public Student selectStudentByName(String name) {
        Student student = studentDao.selectStudentByName(name);
        return student;
    }

    @Override
    public int insertStudent(Student student) {
        int n = studentDao.insertStudent(student);
        return n;
    }

    @Override
    public int updataStudent(Student student) {
        int n = studentDao.updataStudent(student);
        return n;
    }

    @Override
    public int deleteStudentByNumber(String number) {
        int n = studentDao.deleteStudentByNumber(number);
        return n;
    }
}
