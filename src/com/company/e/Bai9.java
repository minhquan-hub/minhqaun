package com.company.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 public class Bai9 {
    int maCN;
    String mHo;
    String mTen;
    int mSoSP;

    public Bai9(int maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        this.setmSoSP(mSoSP);
    }

    public Bai9() {
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public String getmHo() {
        return mHo;
    }

    public void setmHo(String mHo) {
        this.mHo = mHo;
    }

    public String getmTen() {
        return mTen;
    }

    public void setmTen(String mTen) {
        this.mTen = mTen;
    }

    public int getmSoSP() {
        return mSoSP;
    }

    public void setmSoSP(int mSoSP) {
        if(mSoSP > 0){
            this.mSoSP = mSoSP;
        }else {
            this.mSoSP = 0;
        }

    }

    public double tinhLuong(){
        double tinhLuong = 0;
        if(mSoSP > 0 && mSoSP < 200){
             tinhLuong = mSoSP*0.5;
        }else if(mSoSP >= 200 && mSoSP < 400){
            tinhLuong = mSoSP*0.55;
        }else if(mSoSP >= 400 && mSoSP < 600){
            tinhLuong = mSoSP*0.6;
        }else if(mSoSP >= 600){
            tinhLuong = mSoSP*0.65;
        }
        return tinhLuong;
    }

    public  void print(){
       // return String.format("%-10s %-10s %-10s %-10s","MA","HO","Ten","SoSP");
        System.out.println(String.format("%-10s %-10s %-10s %-10s %10.5s",maCN,mHo,mTen,mSoSP,tinhLuong()));
    }
}

 class DanhSachCongNhan {
     static ArrayList<Bai9> list = new ArrayList<Bai9>();
       void taoDanhSach(Bai9 ... tao){
        for (int i = 0; i < tao.length; i++) {
            list.add(tao[i]);
        }
    }

     void them1CN(Bai9 CN){
        list.add(CN);
    }
     void information(){
        Iterator<Bai9> t = list.iterator();
        while (t.hasNext()){
            t.next().print();
        }
    }

     int count(){
          Iterator<Bai9> t =list.iterator();
          int count = 0;
          while (t.hasNext()){
              count++;
              t.next();
          }
          return count;
    }

    void CN200SP(){
        System.out.println("Công nhân làm số sản phẩm trên 200: ");
          for(Bai9 tren200sp : list){
              if(tren200sp.mSoSP > 200){
                  tren200sp.print();
              }
          }
    }

     void sort(){
          list.sort(((o1, o2) -> o2.mSoSP - o1.mSoSP));
        System.out.println("sau khi sap xep: ");
        information();
    }

}
class testCN{
    public static void main(String[] args) {
        Bai9 p[] = new Bai9[3];
        p[0] = new Bai9(1,"tran","minh",200);
        p[1] = new Bai9(2,"vo","tuan",300);
        p[2] = new Bai9(3,"le","ngoc",650);
        DanhSachCongNhan d = new DanhSachCongNhan();
        d.taoDanhSach(p[0],p[1],p[2]);
        System.out.println(String.format("%-10s %-10s %-10s %-10s %10s","MA","HO","Ten","SoSP","Luong"));
        d.information();
        d.CN200SP();
        d.sort();
        System.out.print("tong so cong nhan: "+d.count());
    }
}



