package day1;

public class HinhChuNhat {
    // Thuộc tính
    private float chieuDai = 1.0f;
    private float chieuRong = 1.0f;

    // Phương thức khởi tạo
    public HinhChuNhat(){}
    public HinhChuNhat(float chieuDai, float chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public float chuVi(){
        return (chieuDai + chieuRong)*2;
    }
    public float dienTich(){
        return chieuRong * chieuDai;
    }

}
