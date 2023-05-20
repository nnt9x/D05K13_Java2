package day8.bt2;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(4, 8);
        PhanSo ps2 = new PhanSo(5, 6);
        PhanSo ps3 = new PhanSo(2, 5);

        ITinhToan<PhanSo> tinhToanPhanSo = new TinhToanPhanSo();
        PhanSo tong = tinhToanPhanSo.cong(ps1, ps2, ps3);
        PhanSo tich = tinhToanPhanSo.nhan(ps1, ps2, ps3);
        System.out.println(tong);
        System.out.println(tich);

    }
}
