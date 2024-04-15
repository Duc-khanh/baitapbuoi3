import java.util.Scanner;

public class timgiatritrongmang {
    public static void main(String[] args) {
        String[] studentNames = {"khanh", "minh", "hoang", "dan", "chung"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String searchName = scanner.nextLine();

        int position = -1;
        for (int i = 0; i < studentNames.length; i++) {
            if (studentNames[i].equals(searchName)) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Vị trí của sinh viên '" + searchName + "' trong danh sách là: " + position);
        } else {
            System.out.println("Không tìm thấy sinh viên '" + searchName + "' trong danh sách.");
        }
    }
}
