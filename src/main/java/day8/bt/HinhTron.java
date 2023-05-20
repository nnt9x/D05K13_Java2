package day8.bt;

import day8.MayTinh;

public class HinhTron implements IHinhHoc{
    private double banKinh;

    public HinhTron(double banKinh) {
        if(banKinh <= 0){
            throw new RuntimeException("Ban kinh phai lon hon 0");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if(banKinh <= 0){
            throw new RuntimeException("Ban kinh phai lon hon 0");
        }
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI * banKinh * 2;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String toString() {
        return "HinhTron[" +
                "banKinh=" + banKinh +
                ']';
    }
}
