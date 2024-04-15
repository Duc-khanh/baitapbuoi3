import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập kích thước của 2 mảng
        System.out.print("Nhập kích thước của mảng 1: ");
        int size1 = scanner.nextInt();
        System.out.print("Nhập kích thước của mảng 2: ");
        int size2 = scanner.nextInt();

        // khởi tạo 2 mảng số nguyên
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        // nhập giá trị cho mảng 1
        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // nhập giá trị cho mảng 2
        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // tạo mảng thứ 3 có kích thước bằng tổng kích thước 2 mảng
        int[] array3 = new int[size1 + size2];

        // gộp 2 mảng vào mảng thứ 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }
        // hiển thị mảng thứ 3 sau khi gộp
        System.out.print("Mảng sau khi gộp: ");
        for (int num : array3) {
            System.out.print(num + " ");
        }
    }
}
