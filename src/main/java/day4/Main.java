package day4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IHinhHoc3D> hinh = new ArrayList<>();
        // Mang nay co the chua 1 hinh bat ki,mien la implement tu IHinhHoc3D
        HinhCau hinhCau = new HinhCau(4);
        HinhLapPhuong hinhLapPhuong = new HinhLapPhuong(5);
        HinhLapPhuong hinhLapPhuong1 = new HinhLapPhuong(8);
        hinh.add(hinhCau);
        hinh.add(hinhLapPhuong);
        hinh.add(hinhLapPhuong1);

        // In ra thong tin -> the tich tung hinh
        for (IHinhHoc3D h : hinh) {
            System.out.println(h);
        }

    }
}
