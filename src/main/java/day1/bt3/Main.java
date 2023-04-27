package day1.bt3;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Student students[] = new Student[10];
        // Nhập thông tin cho 10 người.
        // Sử dụng thư viện Faker -> dữ liệu
        // a.
        System.out.println("a.Tạo 1 mảng gồm 10 sinh viên");
        Faker faker = new Faker(new Locale("vi-VN"));
        for (int i = 0; i < 10; i++) {
            long id = i;
            String name = faker.name().fullName();
            long mark = faker.number().numberBetween(1, 101);
            students[i] = new Student(id,name,mark);
        }
        System.out.println("b.In ra mảng vừa tạo");
        for (int i = 0; i < 10; i++) {
            System.out.println(students[i].toString());
        }
        System.out.println("c. In ra điểm trung bình của lớp.");
        long total = 0;
        for (int i = 0; i < 10; i++) {
            total = total + students[i].getMark();
        }
        System.out.println("Điểm trung bình = " + total/10);

        System.out.println("d. In ra thông tin bạn có diểm cao nhất.");
        // Buoc1: tim diem cao nhat
        // For-each
        long maxMark = 0;
        for (Student s: students) {
            if(maxMark < s.getMark()){
                maxMark = s.getMark();
            }
        }

        // Buoc2: In ra tat ca cac ban, co diem = diem cao nhat
        for (Student s: students) {
            if(s.getMark() == maxMark){
                System.out.println(s);
            }
        }
    }
}
