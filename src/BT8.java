import java.util.InputMismatchException;
import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        // Kiểm tra điều kiện số không phải số nguyên tố
        while (true) {
            try {
                System.out.println("Nhập số cần kiểm tra:");
                num = scanner.nextInt();

                if (num < 2) {
                    System.out.println("Lỗi: Số cần kiểm tra phải lớn hơn 1. Hãy thử lại.");
                    continue;
                }

                break;
            } catch (InputMismatchException e) {
                // Xử lý ngoại lệ
                System.out.println("Lỗi: Bạn phải nhập một số nguyên. Hãy thử lại.");
                // Loại bỏ giá trị không hợp lệ
                scanner.next();
            }
        }

        // Kiểm tra tính số nguyên tố
        boolean isPrime = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Hiển thị kết quả
        if (isPrime) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " không phải là số nguyên tố.");
        }

        // Kết thúc chương trình
        scanner.close();
    }
}
