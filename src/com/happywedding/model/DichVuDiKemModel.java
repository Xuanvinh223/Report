
package com.happywedding.model;


public class DichVuDiKemModel {
    private String maDV;
    private String tenDV;
    private long gia;

    public DichVuDiKemModel(String maDV, String tenDV, long gia) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.gia = gia;
    }

    public DichVuDiKemModel() {
    }
    
    public String getInfo(){
        return this.maDV + " " + this.tenDV;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

   
}
