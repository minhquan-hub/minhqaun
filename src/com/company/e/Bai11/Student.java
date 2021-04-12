package com.company.e.Bai11;

import java.util.ArrayList;

public class Student {
    private String name;
    private int yearOfBirth;
    private MonHoc subject;

    public static ArrayList<Student> listStudent = new ArrayList<>();

    public Student(String name, int yearOfBirth, MonHoc subject) {
        setName(name);
        setyearOfBirth(yearOfBirth);
        setSubject(subject);
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("")){
            this.name = "xxx";
        }else {
            this.name = name;
        }
    }

    public int getyearOfBirth() {
        return yearOfBirth;
    }

    public void setyearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public MonHoc getSubject() {
        return subject;
    }

    public void setSubject(MonHoc subject) {
        this.subject = subject;
    }

    public void addStudent(Student st){
        listStudent.add(st);
    }

    public double averageScore(){
        double average = 0;
        double sum = subject.getToanScore()+subject.getVanScore()+subject.getHoaScore()+subject.getLyScore()+subject.getTinScore();
        return average = sum/5;
    }

    @Override
    public String toString() {
        //return String.format("%-10s | %10s | %-10s | %-10s | %-10s | %-10s | %-10s","Name","Year Of Birth","Toan","Van","Ly","Hoa","Tin");
        return String.format("%-10s | %-13s | %-5s | %-5s | %-5s | %-5s | %-5s | %-8.4s",getName(),getyearOfBirth(),getSubject().getToanScore(),getSubject().getVanScore(),getSubject().getLyScore(),getSubject().getHoaScore(),getSubject().getTinScore(),averageScore());
    }
}
