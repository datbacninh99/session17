import java.util.InputMismatchException;
import java.util.Scanner;

public class BT12 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true) {
            try {
                System.out.println("Nhập số thứ nhất:");
                num1 = scanner.nextInt();

                System.out.println("Nhập số thứ hai:");
                num2 = scanner.nextInt();

                // Kiểm tra điều kiện cả hai số bằng 0
                if (num1 == 0 && num2 == 0) {
                    throw new Exception("Lỗi: Cả hai số không thể đều bằng 0. Hãy thử lại.");
                }

                break;
            } catch (InputMismatchException e) {
                // Xử lý ngoại lệ
                System.out.println("Lỗi: Bạn phải nhập một số nguyên. Hãy thử lại.");
                scanner.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Tìm ước chung lớn nhất (UCLN)
        int gcd = findGCD(num1, num2);

        // Hiển thị kết quả
        System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + gcd);

        // Kết thúc chương trình
        scanner.close();
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }
}