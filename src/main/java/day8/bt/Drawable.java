package day8.bt;

public class Drawable {
    // T là 1 class, hoặc 1 interface extends/implement từ IHinhHoc
    public <T extends IHinhHoc> void draw ( T t){
        System.out.println("Vẽ hình: " + t.toString());
    }
}
