package com.xxxx.domian;

public class Student {
    private int id;
    private String name;
    private String number;
    private String crouses;
    private String crousescore;
    private String score;

    public Student() {
    }

    public Student(int id, String name, String number, String crouses, String crousescore, String score) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.crouses = crouses;
        this.crousescore = crousescore;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCrouses() {
        return crouses;
    }

    public void setCrouses(String crouses) {
        this.crouses = crouses;
    }

    public String getCrousescore() {
        return crousescore;
    }

    public void setCrousescore(String crousescore) {
        this.crousescore = crousescore;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", crouses='" + crouses + '\'' +
                ", crousescore='" + crousescore + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
