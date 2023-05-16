package design_pattern.factory_method3.caphe;

import design_pattern.factory_method3.caphe.CaPhe;

class Espresso implements CaPhe {
    private String loaiHat;
    private int luongCaPhe;
    private int luongDuong;
    private int apSuat;

    Espresso(String loaiHat, int luongCaPhe, int luongDuong, int apSuat) {
        this.loaiHat = loaiHat;
        this.luongCaPhe = luongCaPhe;
        this.luongDuong = luongDuong;
        this.apSuat = apSuat;
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

    public int getLuongDuong() {
        return luongDuong;
    }

    public void setLuongDuong(int luongDuong) {
        this.luongDuong = luongDuong;
    }

    public int getApSuat() {
        return apSuat;
    }

    public void setApSuat(int apSuat) {
        this.apSuat = apSuat;
    }

    @Override
    public void taoCaPhe() {
        System.out.println("Tao cafe espresso voi cong thuc dac biet");
    }
}
