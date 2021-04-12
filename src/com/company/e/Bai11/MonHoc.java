package com.company.e.Bai11;

public class MonHoc {
    private double toanScore;
    private double vanScore;
    private double lyScore;
    private double hoaScore;
    private double tinScore;

    public MonHoc(double toanScore, double vanScore, double lyScore, double hoaScore, double tinScore) {
        setToanScore(toanScore);
        setVanScore(vanScore);
        setLyScore(lyScore);
        setHoaScore(hoaScore);
        setTinScore(tinScore);
    }

    public MonHoc() {
    }

    public double getToanScore() {
        return toanScore;
    }

    public void setToanScore(double toanScore) {
        this.toanScore = check(toanScore);
    }

    public double getVanScore() {
        return vanScore;
    }

    public void setVanScore(double vanScore) {
        this.vanScore = check(vanScore);
    }

    public double getLyScore() {
        return lyScore;
    }

    public void setLyScore(double lyScore) {
        this.lyScore = check(lyScore);
    }

    public double getHoaScore() {
        return hoaScore;
    }

    public void setHoaScore(double hoaScore) {
        this.hoaScore = check(hoaScore);
    }

    public double getTinScore() {
        return tinScore;
    }

    public void setTinScore(double tinScore) {
        this.tinScore = check(tinScore);
    }

    public double check(double Score){
        if (Score <0 || Score > 10){
            return Score = 0;
        }else {
            return Score;
        }
    }
}
