package design_pattern.singleton;

public class Main {
    public static void main(String[] args) {
        ChuTich chuTich = ChuTich.getInstance();
        chuTich.duaRaQuyetDinh();
        chuTich.kiDuAn();
        // DOi tuong giong nhau se co chung hashcode
        System.out.println(chuTich.hashCode());

        ChuTich chuTich2 = ChuTich.getInstance();
        chuTich2.duaRaQuyetDinh();
        chuTich2.kiDuAn();
        System.out.println(chuTich2.hashCode());

    }
}
