public class TemperatureChange {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Nhập giá trị độ C");
        celsius = sc.nextFloat();
        fahrenheit = (9 * celsius) / 5 + 32;//bieu thuc chuyen tu do C sang F
        System.out.println("Độ F sau khi chuyển từ độ C là :" + fahrenheit);
    }
}
