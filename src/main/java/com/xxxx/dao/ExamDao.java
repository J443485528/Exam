package com.xxxx.dao;

import com.xxxx.domian.Exam;

import java.util.List;

public interface ExamDao {
    /*查询所有考试*/
    List<Exam> selectAllExam();
    /*查询考试通过名字*/
    List<Exam> selectExamByName(String examname);
    /*插入考试*/
    int insertExam(Exam exam);
    /*修改考试信息*/
    int updataExam(Exam exam);
}
