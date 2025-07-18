import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Nhập các giá trị cho mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] % 2 == 0) {
                    evenSum += array[i][j];
                } else {
                    oddSum += array[i][j];
                }
            }
        }
        System.out.println("Tổng các số chẵn trong mảng: " + evenSum);
        System.out.println("Tổng các số lẻ trong mảng: " + oddSum);
    }
}
