package com.xxxx.controller;

import com.xxxx.domian.Student;
import com.xxxx.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService service;

    /*查询所有的学生*/
    @RequestMapping("/listStudents.do")
    public String listStudents(Student student, HttpServletRequest request){
        List<Student> list = service.selectStudent();
        request.setAttribute("list",list);
        return "studentmessage.jsp";
    }
    /*学号查询学生*/
    @RequestMapping("/findById.do")
    public String findById(HttpServletRequest request){
        String number = request.getParameter("number");
        Student student = service.selectStudentByNumber(number);
        request.setAttribute("student",student);
        return "sm1.jsp";
    }

    /*姓名查询学生*/
    @RequestMapping("/findByName.do")
    public String findByName(HttpServletRequest request){
        String name = request.getParameter("name");
        Student student = service.selectStudentByName(name);
        request.setAttribute("student",student);
        return "sm2.jsp";
    }
    /*插入学生*/
    @RequestMapping("/addStudent.do")
    public String addStudent(Student student){
        int n = service.insertStudent(student);
        if(n>=1){
            return "/listStudents.do";
        }
       return "fail.jsp";
    }
    /*修改学生页面跳转*/
    @RequestMapping("/edit.do")
    public String edit(HttpServletRequest request, HttpSession session){
        String name = request.getParameter("name");
        Student student = service.selectStudentByName(name);
        session.setAttribute("student",student);
        return "updatastudent.jsp";
    }
    /*修改学生*/
    @RequestMapping("/updataStudent.do")
    public String updataStudent(Student student){

        int n = service.updataStudent(student);
        if(n>=1){
            return "/listStudents.do";
        }else {
            return "fail.jsp";
        }

        
    }
}
