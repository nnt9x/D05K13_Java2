package day4;

public class HinhHop implements IHinhHoc3D {
    private double chieuDai;
    private double chieuRong;
    private double chieuCao;

    public HinhHop() {
    }
    public HinhHop(double chieuDai, double chieuRong, double chieuCao) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public double theTich() {
        return chieuDai * chieuRong * chieuCao;
    }

    @Override
    public String toString() {
        return "HinhHop{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chieuCao=" + chieuCao +
                ", theTich=" + theTich() +
                '}';
    }
}
