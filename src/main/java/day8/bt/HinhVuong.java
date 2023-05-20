package day8.bt;

public class HinhVuong implements  IHinhHoc{

    private double canh;

    public HinhVuong(double canh) {
        if(canh <= 0){
            throw new RuntimeException("Canh phai lon hon 0");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if(canh <= 0){
            throw new RuntimeException("Canh phai lon hon 0");
        }
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh * 4;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public String toString() {
        return "HinhVuong[" +
                "canh=" + canh +
                ']';
    }
}
