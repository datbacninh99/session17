import java.util.InputMismatchException;
import java.util.Scanner;

public class BT14 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int[] arr;

        while (true) {
            try {
                System.out.println("Nhập số lượng phần tử của mảng:");
                n = scanner.nextInt();

                // Kiểm tra điều kiện mảng rỗng
                if (n <= 0) {
                    throw new Exception("Lỗi: Số lượng phần tử của mảng phải lớn hơn 0. Hãy thử lại.");
                }

                arr = new int[n];

                // Nhập giá trị cho mảng
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
                    arr[i] = scanner.nextInt();
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

        // Tính giá trị trung bình
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum / n;

        // Hiển thị kết quả
        System.out.println("Giá trị trung bình của mảng là: " + average);

        // Kết thúc chương trình
        scanner.close();
    }
}