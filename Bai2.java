import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        int sum = 0;
        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            sum += array[i]; 
        }

        System.out.println("Tổng các phần tử trong mảng: " + sum);
    }
}
