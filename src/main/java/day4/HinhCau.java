package day4;

public class HinhCau implements IHinhHoc3D{
    private double banKinh;
    private String mauSac = "Xanh";

    public HinhCau(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhCau(double banKinh, String mauSac) {
        this.banKinh = banKinh;
        this.mauSac = mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public double theTich() {
        return Math.PI * banKinh * banKinh * banKinh * 4 / 3;
    }

    @Override
    public String toString() {
        return "HinhCau{" +
                "banKinh=" + banKinh +
                ", mauSac='" + mauSac + '\'' +
                ", theTich=" + theTich() +
                '}';
    }
}
