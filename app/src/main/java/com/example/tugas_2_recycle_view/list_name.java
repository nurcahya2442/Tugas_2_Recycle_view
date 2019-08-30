package com.example.tugas_2_recycle_view;

public class list_name {
    private String judul,isi, time;
    private int pic;


    public list_name(String judul, String time, String isi, int pic) {
        this.judul = judul;
        this.time = time;
        this.isi = isi;
        this.pic = pic;


    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}