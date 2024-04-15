import java.util.Scanner;

public class timgiatrinhonhat {
    public static void main(String[] args) {
        final int SIZE = 5; // Kích thước của mảng

        int[] arr = new int[SIZE]; // Khai báo mảng số nguyên

        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị cho các phần tử trong mảng từ bàn phím
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        // Tìm giá trị nhỏ nhất trong mảng
        int minValue = arr[0];

        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        // Hiển thị giá trị nhỏ nhất trong mảng
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);
    }
}