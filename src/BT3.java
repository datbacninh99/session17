import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;

        // Nhập các phần tử của mảng và tính tổng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + ":");
            try {
                array[i] = Integer.parseInt(scanner.next());
                sum += array[i];  // Tính tổng các phần tử của mảng
            } catch (NumberFormatException e) {
                // Nếu nhập sai, hiển thị thông báo lỗi và bỏ qua phần tử này
                System.out.println("Giá trị nhập vào không phải là số nguyên. Phần tử này sẽ bị bỏ qua.");
            }
        }

        // Hiển thị kết quả
        System.out.println("Tổng của mảng là: " + sum);

        // Kết thúc chương trình
        // Chương trình sẽ tự động kết thúc sau khi đã tính tổng và hiển thị kết quả
    }
}