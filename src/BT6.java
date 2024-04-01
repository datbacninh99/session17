import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số bị chia:");
        int dividend = scanner.nextInt();

        System.out.println("Nhập số chia:");
        int divisor = scanner.nextInt();

        // Xử lý ngoại lệ
        try {
            // Thực hiện phép chia
            int result = dividend / divisor;
            // Hiển thị kết quả hoặc thông báo lỗi
            System.out.println("Kết quả phép chia là: " + result);
        } catch (ArithmeticException e) {
            // Hiển thị kết quả hoặc thông báo lỗi
            System.out.println("Lỗi: Không thể chia cho 0");
        } finally {
            // Kết thúc chương trình
            scanner.close();
        }
    }
}