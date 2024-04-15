import java.util.Scanner;

public class xoaphantukhoimang {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10}; // Mảng ban đầu
        int deleteNum;
        boolean found = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số cần xoá khỏi mảng: ");
        deleteNum = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == deleteNum) {
                found = true;
                // Xoá phần tử bằng cách ghi đè phần tử đằng sau lên phần tử hiện tại
                for (int j = i; j < numbers.length - 1; j++) {
                    numbers[j] = numbers[j + 1];
                }
                break;
            }
        }
        if (found) {
            // Giảm kích thước của mảng đi 1 sau khi xoá
            int[] newArray = new int[numbers.length - 1];
            System.arraycopy(numbers,0, newArray, 0, numbers.length - 1);

            System.out.println("Phần tử " + deleteNum + " đã được xoá khỏi mảng.");
            System.out.print("Mảng sau khi xoá: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Phần tử " + deleteNum + " không xuất hiện trong mảng.");
        }
    }
}
