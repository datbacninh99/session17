import java.util.Arrays;
import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        // Khai báo biến và nhập dữ liệu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Sắp xếp mảng
        Arrays.sort(array);

        // Nhập giá trị cần tìm kiếm
        System.out.println("Nhập giá trị cần tìm kiếm:");
        int target = scanner.nextInt();

        // Thực hiện tìm kiếm nhị phân
        int result = binarySearch(array, target);

        // Xử lý kết quả
        if (result == -1) {
            System.out.println("Phần tử không được tìm thấy trong mảng.");
        } else {
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
        }
    }

    // Hàm tìm kiếm nhị phân
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}