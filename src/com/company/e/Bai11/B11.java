package com.company.e.Bai11;

public class B11 {
    public static void main(String[] args) {
        // tạo profile học vien 1
        MonHoc subject1 = new MonHoc(5,6,7.2,8.3,9.2);
        Student st1 = new Student("quan",2000,subject1);

        // tạo profile hoc vien 2
        MonHoc subject2 = new MonHoc(8,8.6,8.9,3.9,9.2);
        Student st2 = new Student("toan",2000,subject2);

        // tạo profile hoc vien 3
        MonHoc subject3 = new MonHoc(4.5,6.3,7,4.2,5.3);
        Student st3 = new Student("tuan",2000,subject3);

        // tạo profile hoc vien 4
        MonHoc subject4 = new MonHoc(6.5,4.5,8.6,7.9,9.2);
        Student st4 = new Student("binh",2000,subject4);

        // tạo profile hoc vien 5
        MonHoc subject5 = new MonHoc(5,6.5,6,6.4,5.8);
        Student st5 = new Student("thong",2000,subject5);

        // them tat cả sinh vien vao list
        Student st = new Student();
        st.addStudent(st1);
        st.addStudent(st2);
        st.addStudent(st3);
        st.addStudent(st4);
        st.addStudent(st5);

        Course c = new Course();
        // sinh vien luan van
        c.printLuanVan();

        // sinh vien tot nghiep
        c.printTotNghiep();

        // sinh vien thi lai
        c.printThiLai();




    }
}
