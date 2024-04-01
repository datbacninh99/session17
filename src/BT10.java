import java.util.InputMismatchException;
import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        double radius = 0;

        // Kiểm tra điều kiện giá trị âm
        while (true) {
            try {
                System.out.println("Nhập bán kính hình tròn:");
                radius = scanner.nextDouble();

                if (radius < 0) {
                    System.out.println("Lỗi: Bán kính phải là một số không âm. Hãy thử lại.");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                // Xử lý ngoại lệ
                System.out.println("Lỗi: Bạn phải nhập một số. Hãy thử lại.");
                // Loại bỏ giá trị không hợp lệ
                scanner.next();
            }
        }

        // Tính diện tích hình tròn
        double area = Math.PI * radius * radius;

        // Hiển thị kết quả
        System.out.println("Diện tích hình tròn với bán kính " + radius + " là: " + area);

        // Kết thúc chương trình
        scanner.close();
    }
}