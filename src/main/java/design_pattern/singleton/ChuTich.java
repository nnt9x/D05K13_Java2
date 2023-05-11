package design_pattern.singleton;

public class ChuTich {
    private String hoTen;

    // Thuc the mac dinh la null
    private static ChuTich instance = null;

    // Khoá ko cho phép tạo đối tượng từ bên ngoài
    private ChuTich(String hoTen) {
        this.hoTen = hoTen;
    }

    public static ChuTich getInstance() {
        if (instance == null) {
            instance = new ChuTich("BKD05K13");
        }
        return instance;
    }

    public void duaRaQuyetDinh() {
        System.out.println("Chủ tịch " + hoTen + " đưa ra quyết định");
    }

    public void kiDuAn() {
        System.out.println("Chủ tịch " + hoTen + " kí dự án");
    }
}
