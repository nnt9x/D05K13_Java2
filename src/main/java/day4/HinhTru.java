package day4;

public class HinhTru implements IHinhHoc3D{
    private double banKinh;
    private double chieuCao;

    public HinhTru(double banKinh, double chieuCao) {
        this.banKinh = banKinh;
        this.chieuCao = chieuCao;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public double theTich() {
        return Math.PI * banKinh * banKinh * chieuCao;
    }
}
