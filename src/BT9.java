import java.util.InputMismatchException;
import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        // Kiểm tra điều kiện n là số nguyên dương
        while (true) {
            try {
                System.out.println("Nhập số thứ tự trong dãy Fibonacci:");
                n = scanner.nextInt();

                if (n <= 0) {
                    System.out.println("Lỗi: Số thứ tự phải là một số nguyên dương. Hãy thử lại.");
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

        // Tính số Fibonacci thứ n
        int fib = fibonacci(n);

        // Hiển thị kết quả
        System.out.println("Số Fibonacci thứ " + n + " là: " + fib);

        // Kết thúc chương trình
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}