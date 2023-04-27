package day1;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        System.out.println("Chu vi HNC1 = " + hcn1.chuVi());
        HinhChuNhat hcn2 = new HinhChuNhat(2, 3);
        System.out.println("Diện tích HCN2 = " + hcn2.dienTich());
    }
}
