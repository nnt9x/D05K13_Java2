package day8.bt2;

public class TinhToanPhanSo implements ITinhToan<PhanSo> {
    @Override
    public PhanSo cong(PhanSo... args) {
        PhanSo tong = new PhanSo(0, 1);
        for (PhanSo ps : args) {
            tong = tong.cong(ps);
        }
        return tong;
    }

    @Override
    public PhanSo tru(PhanSo t1, PhanSo t2) {
        return t1.tru(t2);
    }

    @Override
    public PhanSo nhan(PhanSo... args) {
        PhanSo tich = new PhanSo(1, 1);
        for (PhanSo ps : args) {
            tich = tich.nhan(ps);
        }
        return  tich;
    }

    @Override
    public PhanSo chia(PhanSo t1, PhanSo t2) {
        return t1.chia(t2);
    }
}
