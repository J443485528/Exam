package com.xxxx.domian;

public class Exam {
    private String examname;
    private String examscore;
    private String examaddress;
    private String examdata;

    public Exam() {
    }

    public Exam(String examname, String examscore, String examaddress, String examdata) {
        this.examname = examname;
        this.examscore = examscore;
        this.examaddress = examaddress;
        this.examdata = examdata;
    }

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname;
    }

    public String getExamscore() {
        return examscore;
    }

    public void setExamscore(String examscore) {
        this.examscore = examscore;
    }

    public String getExamaddress() {
        return examaddress;
    }

    public void setExamaddress(String examaddress) {
        this.examaddress = examaddress;
    }

    public String getExamdata() {
        return examdata;
    }

    public void setExamdata(String examdata) {
        this.examdata = examdata;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examname='" + examname + '\'' +
                ", examscore='" + examscore + '\'' +
                ", examaddress='" + examaddress + '\'' +
                ", examdata='" + examdata + '\'' +
                '}';
    }
}
