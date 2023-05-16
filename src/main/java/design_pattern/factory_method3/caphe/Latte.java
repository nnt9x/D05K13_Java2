package design_pattern.factory_method3.caphe;

import design_pattern.factory_method3.caphe.CaPhe;

class Latte implements CaPhe {

    private String loaiHat;
    private int luongCaPhe;
    private int luongSua;

    private int luongNuoc;

    Latte(String loaiHat, int luongCaPhe, int luongSua, int luongNuoc) {
        this.loaiHat = loaiHat;
        this.luongCaPhe = luongCaPhe;
        this.luongSua = luongSua;
        this.luongNuoc = luongNuoc;
    }

    public String getLoaiHat() {
        return loaiHat;
    }

    public void setLoaiHat(String loaiHat) {
        this.loaiHat = loaiHat;
    }

    public int getLuongCaPhe() {
        return luongCaPhe;
    }

    public void setLuongCaPhe(int luongCaPhe) {
        this.luongCaPhe = luongCaPhe;
    }

    public int getLuongSua() {
        return luongSua;
    }

    public void setLuongSua(int luongSua) {
        this.luongSua = luongSua;
    }

    public int getLuongNuoc() {
        return luongNuoc;
    }

    public void setLuongNuoc(int luongNuoc) {
        this.luongNuoc = luongNuoc;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Tao cafe latte voi cong thuc dac biet");
    }
}
