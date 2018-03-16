public class TemperatureChange {
    public static void main(String[] args) {
        float c, f;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Nhập giá trị độ C");
        c = sc.nextFloat();
        f = (9 * c) / 5 + 32;//bieu thuc chuyen tu do C sang F
        System.out.println("Độ F sau khi chuyển từ độ C là :" + f);
    }
}
