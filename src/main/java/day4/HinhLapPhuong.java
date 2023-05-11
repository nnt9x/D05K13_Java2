package day4;

public class HinhLapPhuong implements IHinhHoc3D {
    private double canh;

    public HinhLapPhuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double theTich() {
        return canh * canh * canh;
    }

    @Override
    public String toString() {
        return "HinhLapPhuong{" +
                "canh=" + canh +
                ",theTich=" + theTich() +
                '}';
    }
}
