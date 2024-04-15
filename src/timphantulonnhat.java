import java.util.Scanner;

public class timphantulonnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.print("nhap số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        // Khởi tạo ma trận số thực
        double[][] matrix = new double[rows][cols];

        // nhập giá trị cho ma trận từ người dùng
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        // Tìm phần tử lớn nhất trong ma trận
        double maxElement = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        // Hiển thị kết quả
        System.out.println("Phần tử lớn nhất trong ma trận là: " + maxElement);
        System.out.println("Tọa độ của phần tử lớn nhất: [" + maxRow + "][" + maxCol + "]");
    }
}