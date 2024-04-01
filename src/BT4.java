import java.util.Scanner;
import java.util.ArrayList;

public class BT4 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();

        // Duyệt chuỗi và chuyển đổi các ký tự thành số nguyên
        for (char c : str.toCharArray()) {
            try {
                // Thử chuyển đổi ký tự thành số nguyên và thêm vào danh sách
                list.add(Integer.parseInt(String.valueOf(c)));
            } catch (NumberFormatException e) {
                // Nếu không thể chuyển đổi, thêm số 0 vào danh sách và hiển thị thông báo
                System.out.println("Ký tự '" + c + "' không phải là số nguyên. Đã thay thế bằng 0.");
                list.add(0);
            }
        }

        // Hiển thị kết quả
        System.out.println("Chuỗi sau khi chuyển đổi: " + list);

        // Kết thúc chương trình
        // Chương trình sẽ tự động kết thúc sau khi đã chuyển đổi chuỗi và hiển thị danh sách
    }
}