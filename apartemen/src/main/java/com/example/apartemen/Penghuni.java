package com.example.apartemen;

public class Penghuni {
    String nama;
    String asal;
    String nohp;
    Double saldo;
    Double biaya;
    Double sisa = 0.0;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getBiaya() {
        return biaya;
    }

    public void setBiaya(Double biaya) {
        this.biaya = biaya;
    }

    public void hasil(){
        sisa = saldo - biaya;
        System.out.println(+sisa);
    }
}
