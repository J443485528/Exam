package com.xxxx.service.Impl;

import com.xxxx.dao.ExamDao;
import com.xxxx.domian.Exam;
import com.xxxx.service.ExamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ExamServiceImpl implements ExamService {
    @Resource
    private ExamDao examDao;
    @Override
    public List<Exam> selectAllExam() {
        List<Exam> exams = examDao.selectAllExam();
        return exams;
    }

    @Override
    public List<Exam> selectExamByName(String examname) {
        List<Exam> exam = examDao.selectExamByName(examname);
        return exam;
    }

    @Override
    public int insertExam(Exam exam) {
        int n = examDao.insertExam(exam);
        return n;
    }

    @Override
    public int updataExam(Exam exam) {
        int n = examDao.updataExam(exam);
        return n;
    }
}
