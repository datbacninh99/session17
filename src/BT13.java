import java.util.InputMismatchException;
import java.util.Scanner;

public class BT13 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        String str = null;

        while (true) {
            try {
                System.out.println("Nhập chuỗi:");
                str = scanner.nextLine();

                // Kiểm tra điều kiện chuỗi rỗng hoặc null
                if (str == null || str.isEmpty()) {
                    throw new Exception("Lỗi: Chuỗi không thể rỗng. Hãy thử lại.");
                }

                break;
            } catch (Exception e) {
                // Xử lý ngoại lệ
                System.out.println(e.getMessage());
            }
        }

        // Đảo ngược chuỗi
        String reversedStr = new StringBuilder(str).reverse().toString();

        // Hiển thị kết quả
        System.out.println("Chuỗi đảo ngược là: " + reversedStr);

        // Kết thúc chương trình
        scanner.close();
    }
}