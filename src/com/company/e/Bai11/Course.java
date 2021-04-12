package com.company.e.Bai11;

import java.util.ArrayList;

public class Course extends Student{
    static int countTotNghiep = 0;
    static int countLuanVan = 0;
    static int countThiLai = 0;
    public  static ArrayList<Student> studentTotNghiep = new ArrayList<>();
    static ArrayList<Student> studentLuanVan = new ArrayList<>();
    static ArrayList<Student> studentThiLai = new ArrayList<>();

static {
    for(Student st : listStudent){
        if(st.getSubject().getToanScore() >= 5 && st.getSubject().getVanScore() >= 5 && st.getSubject().getLyScore() >= 5 && st.getSubject().getHoaScore() >= 5 && st.getSubject().getTinScore() >= 5){
            if(st.averageScore() > 7){
                countLuanVan++;
                studentLuanVan.add(st);
            }else {
                countTotNghiep++;
                studentTotNghiep.add(st);
            }
        } else{
            countThiLai++;
            studentThiLai.add(st);
        }
    }
}

public void printLuanVan(){
    if(countLuanVan == 0){
        System.out.println("###Không có sinh viên làm luận văn");
    }else {
        System.out.println("###Sinh viên làm luận văn: "+countLuanVan);
        System.out.println(String.format("%-10s | %13s | %-5s | %-5s | %-5s | %-5s | %-5s | %-8s","Name","Year Of Birth","Toan","Van","Ly","Hoa","Tin","Diem TB"));
        for (Student st : studentLuanVan){
            System.out.println(st.toString());
        }
    }
}

public void printTotNghiep(){
    if(countTotNghiep == 0){
        System.out.println("###Không có sinh viên tốt nghiệp");
    }else {
        System.out.println("###Sinh viên tốt nghiệp: "+countTotNghiep);
        System.out.println(String.format("%-10s | %13s | %-5s | %-5s | %-5s | %-5s | %-5s | %-8s","Name","Year Of Birth","Toan","Van","Ly","Hoa","Tin","Diem TB"));
        for (Student st : studentTotNghiep){
            System.out.println(st.toString());
        }
    }
}

public void checkThiLai(Student st){
    if(st.getSubject().getToanScore() < 5){
        System.out.println("Thi lại môn Toán: "+st.getSubject().getToanScore());
    }
    if (st.getSubject().getVanScore() < 5){
        System.out.println("Thi lại môn Văn: "+st.getSubject().getVanScore());
    }
    if (st.getSubject().getLyScore() < 5){
        System.out.println("Thi lại môn Lý: "+st.getSubject().getLyScore());
    }
    if (st.getSubject().getHoaScore() < 5){
        System.out.println("Thi lại môn Hóa: "+st.getSubject().getHoaScore());
    }
    if (st.getSubject().getTinScore() < 5){
        System.out.println("Thi lại môn Tin: "+st.getSubject().getTinScore());
    }
}

public void printThiLai(){
    if(countThiLai == 0){
        System.out.println("###Không có sinh vien thi lai");
    }else {
        System.out.println("###Sinh viên thi lại: "+countThiLai);
        System.out.println(String.format("%-10s | %13s | %-5s | %-5s | %-5s | %-5s | %-5s | %-8s","Name","Year Of Birth","Toan","Van","Ly","Hoa","Tin","Diem TB"));
        for (Student st : studentThiLai){
            System.out.println(st.toString());
            checkThiLai(st);
        }

    }
}




}
