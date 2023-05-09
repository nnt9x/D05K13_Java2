package day3.daHinh.bt;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(2,3);
        System.out.println("Chu vi: " + hcn.chuVi());
        System.out.println("Diện tích: " + hcn.dienTich());


        HinhVuong hv = new HinhVuong(5);
        hv.setChieuRong(10);
        hv.setChieuDai(20);
        System.out.println("Chu vi: " + hv.chuVi());
        System.out.println("Diện tích: " + hv.dienTich());


    }
}
