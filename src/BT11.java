import java.util.InputMismatchException;
import java.util.Scanner;

public class BT11 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        int day = 0, month = 0, year = 0;

        // Kiểm tra điều kiện ngày tháng năm hợp lệ
        while (true) {
            try {
                System.out.println("Nhập ngày:");
                day = scanner.nextInt();

                System.out.println("Nhập tháng:");
                month = scanner.nextInt();

                System.out.println("Nhập năm:");
                year = scanner.nextInt();

                if (year < 0 || month < 1 || month > 12 || day < 1 || day > 31) {
                    throw new Exception("Ngày tháng năm không hợp lệ. Hãy thử lại.");
                }

                if (month == 2) {
                    // Kiểm tra năm nhuận
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        if (day > 29) {
                            throw new Exception("Ngày tháng năm không hợp lệ. Hãy thử lại.");
                        }
                    } else {
                        if (day > 28) {
                            throw new Exception("Ngày tháng năm không hợp lệ. Hãy thử lại.");
                        }
                    }
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    if (day > 30) {
                        throw new Exception("Ngày tháng năm không hợp lệ. Hãy thử lại.");
                    }
                }

                break;
            } catch (InputMismatchException e) {
                // Xử lý ngoại lệ
                System.out.println("Lỗi: Bạn phải nhập một số nguyên. Hãy thử lại.");
                // Loại bỏ giá trị không hợp lệ
                scanner.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // Hiển thị kết quả
        System.out.println("Ngày tháng năm hợp lệ.");

        // Kết thúc chương trình
        scanner.close();
    }
}