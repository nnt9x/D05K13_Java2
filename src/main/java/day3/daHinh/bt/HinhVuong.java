package day3.daHinh.bt;

public class HinhVuong extends HinhChuNhat{
    private double canh;

    public HinhVuong(double canh) {
        super(canh, canh);
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    @Override
    public void setChieuRong(double canh) {
        super.setChieuRong(canh);
        super.setChieuDai(canh);
    }
}
