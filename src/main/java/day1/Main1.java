package day1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //a. Tao 2 doi tuong hinh tron
        HinhTron ht1 = new HinhTron();
        HinhTron ht2 = new HinhTron(2);
        System.out.println(ht1);
        System.out.println(ht2);
        //b. Tao mang gom 5 hinh tron => in ra hinh co chu vi lon nhat
        HinhTron arr[] = new HinhTron[5];
        Scanner in = new Scanner(System.in);
        // Nhap mang
        for(int i = 0; i < 5; i++){
            System.out.printf("r[%d]=", i);
            double r = Double.parseDouble(in.nextLine());
            arr[i] = new HinhTron(r);
        }
        // In ra mang vua nhap
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].toString());
        }
        // Tim hinh co chu vi lon nhat
        HinhTron hinhTronMax = arr[0];
        for (int i = 1; i < 5; i++) {
            if(hinhTronMax.chuVi() < arr[i].chuVi()){
                hinhTronMax = arr[i];
            }
        }
        System.out.println("Hinh co chu vi lon nhat la: ");
        System.out.println(hinhTronMax);
    }
}
