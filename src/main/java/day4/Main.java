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

        // Stream: lọc ra 2 hình có thể tích lớn nhất
        hinh.stream().sorted((h1, h2) -> {
            if (h1.theTich() > h2.theTich()) {
                return -1;
            } else if (h1.theTich() < h2.theTich()) {
                return 1;
            } else {
                return 0;
            }
        }).limit(2).forEach(System.out::println);

    }
}
