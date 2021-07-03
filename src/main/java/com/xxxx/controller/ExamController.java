package com.xxxx.controller;

import com.xxxx.domian.Exam;
import com.xxxx.service.ExamService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ExamController {
    @Resource
    private ExamService service;
    /*查询所有考试安排*/
    @RequestMapping("/listExam.do")
    public String ListExam(HttpServletRequest request){
        List<Exam> list = service.selectAllExam();
        request.setAttribute("list",list);
        return "exammessage.jsp";
    }
    /*查询考试通过名称*/
    @RequestMapping("/selectExamByName.do")
    public String selectExamByName(HttpServletRequest request){
        String examname = request.getParameter("examname");
        List<Exam> list = service.selectExamByName(examname);
        request.setAttribute("list",list);
        return "/exammessage.jsp";
    }
    /*插入考试*/
    @RequestMapping("/addExam.do")
    public String addExam(Exam exam){
        int n = service.insertExam(exam);
        if(n>=1){
            return "/listExam.do";
        }
        return "fail.jsp";
    }
    /*修改考试转换*/
    @RequestMapping("/editExam.do")
    public String editExam(HttpServletRequest request){
        String examname = request.getParameter("examname");
        List<Exam> list = service.selectExamByName(examname);
        request.setAttribute("list",list);
        return "/updataExam.jsp";
    }
    /*修改考试信息*/
    @RequestMapping("updataExam.do")
    public String updataExam(Exam exam){
        int n = service.updataExam(exam);

        if(n>=1){
            return "/listExam.do";
        }
        return "fail.jsp";
    }
}
