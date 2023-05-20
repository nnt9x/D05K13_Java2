package day8.bt;

public class App {
    public static void main(String[] args) {
        HinhVuong hv =new HinhVuong(4);
        HinhTron ht = new HinhTron(4);

        Drawable drawable = new Drawable();
        drawable.draw(hv);
        drawable.draw(ht);
    }
}
