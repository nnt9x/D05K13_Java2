package day8.bt2;

import java.math.BigInteger;

public class PhanSo {
    private long tuSo = 0;
    private long mauSo = 1;

    public PhanSo() {
    }

    public PhanSo(long tuSo, long mauSo) {
        if (mauSo == 0) {
            throw new RuntimeException("Mau so phai khac 0");
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public long getTuSo() {
        return tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return mauSo;
    }

    public void setMauSo(long mauSo) {
        if (mauSo == 0) {
            throw new RuntimeException("Mau so phai khac 0");
        }
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return String.format("(%d/%d)", tuSo, mauSo);
    }

    public PhanSo rutGonPhanSo() {
        BigInteger tmpTuSo = BigInteger.valueOf(tuSo);
        BigInteger tmpMauSo = BigInteger.valueOf(mauSo);
        BigInteger UCLN = tmpTuSo.gcd(tmpMauSo);

        long newTuSo = this.tuSo / UCLN.longValue();
        long newMauSo = this.mauSo / UCLN.longValue();
        return new PhanSo(newTuSo, newMauSo);
    }

    public PhanSo cong(PhanSo ps2) {
        long newTuSo = this.tuSo * ps2.mauSo + this.mauSo * ps2.tuSo;
        long newMauSo = this.mauSo * ps2.mauSo;
        PhanSo psTong = new PhanSo(newTuSo, newMauSo);
        return psTong.rutGonPhanSo();
    }

    public PhanSo tru(PhanSo ps2) {
        PhanSo tmp_ps2 = new PhanSo(-ps2.tuSo, ps2.mauSo);
        return this.cong (tmp_ps2);
    }

    public PhanSo nhan(PhanSo ps2){
        long newTuSo = this.tuSo * ps2.tuSo;
        long newMauSo = this.mauSo * ps2.mauSo;
        PhanSo psTich = new PhanSo(newTuSo, newMauSo);
        return psTich.rutGonPhanSo();
    }

    public PhanSo chia(PhanSo ps2){
        if(ps2.tuSo == 0){
            throw new RuntimeException("Khong the thuc hien phep chia voi tu so bang 0");
        }
        PhanSo tmp_ps2 = new PhanSo(ps2.mauSo, ps2.tuSo);
        return this.nhan(tmp_ps2);
    }

}
