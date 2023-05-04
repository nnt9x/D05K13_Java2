package day2.bt3;

public class HinhThangCan {
    private double dayLon;
    private double dayBe;
    private double chieuCao;

    public HinhThangCan(double dayLon, double dayBe, double chieuCao) {
        if (dayLon <= 0 || dayBe <= 0 || chieuCao <= 0) {
            throw new RuntimeException("Canh phai duong");
        }
        this.dayLon = dayLon;
        this.dayBe = dayBe;
        this.chieuCao = chieuCao;
    }

    public double getDayLon() {
        return dayLon;
    }

    public void setDayLon(double dayLon) {
        if (dayLon <= 0) {
            throw new RuntimeException("Canh phai duong");
        }
        this.dayLon = dayLon;
    }

    public double getDayBe() {
        return dayBe;
    }

    public void setDayBe(double dayBe) {
        if (dayBe <= 0) {
            throw new RuntimeException("Canh phai duong");
        }
        this.dayBe = dayBe;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        if (chieuCao <= 0) {
            throw new RuntimeException("Canh phai duong");
        }
        this.chieuCao = chieuCao;
    }

    public double dienTich() {
        return (dayLon + dayBe) * chieuCao / 2;
    }

    public double chuVi() {
        // Can tinh canh ben
        double tmp = (dayLon - dayBe) / 2;
        double canhBen = Math.sqrt(tmp * tmp + chieuCao * chieuCao);
        return (dayLon + dayBe + canhBen * 2);
    }

    @Override
    public String toString() {
        return String.format("HinhThangCan[" +
                "dayLon=" + dayLon +
                ", dayBe=" + dayBe +
                ", chieuCao=" + chieuCao +
                ", chuVi=" + "%.2f" +
                ", dienTich=" + "%.2f" +
                ']', chuVi(), dienTich());
    }
}
