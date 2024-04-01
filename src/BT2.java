import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Kiểm tra trường hợp mảng rỗng
        if (n == 0) {
            throw new IllegalArgumentException("Mảng không có phần tử nào.");
        }

        // Nhập các phần tử của mảng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        // Tìm số lớn nhất
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Hiển thị kết quả hoặc thông báo lỗi
        System.out.println("Số lớn nhất trong mảng là: " + max);

        // Kết thúc chương trình
        // Chương trình sẽ tự động kết thúc sau khi đã tìm và hiển thị số lớn nhất hoặc hiển thị thông báo lỗi.
    }
}