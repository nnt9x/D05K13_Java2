package day2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("BKC01");
        Student s2 = new Student("BKC02","Nguyen Van A", 8.0);
        // Gan id, name, mark cho s1 làm thế nào??
        // Tính đóng gói: để truy cập dữ liệu phải thông qua phương thức
        s1.setName("Student 1");
        s1.setMark(10);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
