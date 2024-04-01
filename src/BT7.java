import java.util.InputMismatchException;
import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        // Nhập dữ liệu
        while (true) {
            try {
                System.out.println("Nhập số thứ nhất:");
                num1 = scanner.nextInt();

                System.out.println("Nhập số thứ hai:");
                num2 = scanner.nextInt();

                // Thoát khỏi vòng lặp khi không có lỗi
                break;
            } catch (InputMismatchException e) {
                // Bước 3: Xử lý ngoại lệ
                System.out.println("Lỗi: Bạn phải nhập một số nguyên. Hãy thử lại.");
                // Loại bỏ giá trị không hợp lệ
                scanner.next();
            }
        }

        // So sánh và tìm số lớn nhất
        if (num1 > num2) {
            System.out.println("Số lớn nhất là: " + num1);
        } else {
            System.out.println("Số lớn nhất là: " + num2);
        }

        // Kết thúc chương trình
        scanner.close();
    }
}