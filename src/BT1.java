import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        // Lặp cho đến khi nhập đúng số thứ nhất
        while (true) {
            try {
                System.out.println("Nhập số thứ nhất:");
                num1 = Integer.parseInt(scanner.nextLine());
                break;  // Nếu nhập đúng, thoát khỏi vòng lặp
            } catch (NumberFormatException e) {
                // Nếu nhập sai, hiển thị thông báo lỗi và yêu cầu nhập lại
                System.out.println("Giá trị nhập vào không phải là số nguyên. Vui lòng nhập lại.");
            }
        }

        // Lặp lại quá trình trên cho số thứ hai
        while (true) {
            try {
                System.out.println("Nhập số thứ hai:");
                num2 = Integer.parseInt(scanner.nextLine());
                break;  // Nếu nhập đúng, thoát khỏi vòng lặp
            } catch (NumberFormatException e) {
                // Nếu nhập sai, hiển thị thông báo lỗi và yêu cầu nhập lại
                System.out.println("Giá trị nhập vào không phải là số nguyên. Vui lòng nhập lại.");
            }
        }

        // Tính tổng và hiển thị kết quả
        int sum = num1 + num2;
        System.out.println("Tổng của hai số là: " + sum);

        // Kết thúc chương trình
        // Chương trình sẽ tự động kết thúc sau khi đã tính tổng và hiển thị kết quả
    }
}