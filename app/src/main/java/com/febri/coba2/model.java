package com.febri.coba2;

public class model {

    private String nama;
    private String npm;
    private String nohp;
    private  int gambar;

    public model(String nama, String npm,String nohp, int gambar){

        this.nama = nama;
        this.npm = npm;
        this.nohp = nohp;
        this.gambar = gambar;

    }

    public String getNama(){

        return nama;
    }
    public String getNpm(){

        return npm;
    }
    public String getNohp(){

        return nohp;
    }
    public int getGambar() {

        return gambar;
    }
    public void setNama(String nama){

        this.nama = nama;
    }
    public void setNpm(String npm){

        this.npm = npm;
    }
    public void setNohp(String nohp){

        this.nohp = nohp;
    }
    public void setGambar(int gambar){
        this.gambar = gambar;
    }
}
