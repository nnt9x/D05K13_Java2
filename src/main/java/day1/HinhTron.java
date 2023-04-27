package day1;

public class HinhTron {
    private double banKinh = 1.0;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    // Setter-Getter
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public double chuVi() {
        return banKinh * 2 * 3.14;
    }

    public double dienTich() {
        return banKinh * banKinh * 3.14;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                ",chuVi=" + chuVi() +
                ",dienTich=" + dienTich() +
                '}';
    }
}
