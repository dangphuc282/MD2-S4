import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        Integer[] array = new Integer[size];  // Phải dùng Integer (object)

        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Sắp xếp giảm dần
        Arrays.sort(array, Collections.reverseOrder());

        // In kết quả
        System.out.println("Mảng đã sắp xếp theo thứ tự giảm dần:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
