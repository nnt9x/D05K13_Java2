package design_pattern.factory_method3.caphe;

import design_pattern.factory_method3.caphe.CaPhe;

class DenDa implements CaPhe {

    private String loaiHat;
    private int luongDuong;
    private int luongCaPhe;
    private int luongNuoc;

    DenDa(String loaiHat, int luongDuong, int luongCaPhe, int luongNuoc) {
        this.loaiHat = loaiHat;
        this.luongDuong = luongDuong;
        this.luongCaPhe = luongCaPhe;
        this.luongNuoc = luongNuoc;
    }

    public String getLoaiHat() {
        return loaiHat;
    }

    public void setLoaiHat(String loaiHat) {
        this.loaiHat = loaiHat;
    }

    public int getLuongDuong() {
        return luongDuong;
    }

    public void setLuongDuong(int luongDuong) {
        this.luongDuong = luongDuong;
    }

    public int getLuongCaPhe() {
        return luongCaPhe;
    }

    public void setLuongCaPhe(int luongCaPhe) {
        this.luongCaPhe = luongCaPhe;
    }

    public int getLuongNuoc() {
        return luongNuoc;
    }

    public void setLuongNuoc(int luongNuoc) {
        this.luongNuoc = luongNuoc;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Tao cafe den da voi cong thuc dac biet");
    }
}
