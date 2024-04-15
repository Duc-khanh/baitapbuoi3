import java.util.Scanner;

public class timgiatrilonnhattrongmang {
    public static void main(String[] args) {
        double[] wealthArray = new double[20];
        int numberOfInputs;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng giá trị tài sản (tối đa 20): ");
        numberOfInputs = scanner.nextInt();

        if (numberOfInputs > 20) {
            System.out.println("Số lượng giá trị vượt quá 20. Chương trình sẽ chỉ xử lý 20 giá trị đầu tiên.");
            numberOfInputs = 20;
        }
        for (int i = 0; i < numberOfInputs; i++) {
            System.out.print("Nhập giá trị tài sản của tỷ phú thứ " + (i + 1) + " (tỉ USD): ");
            wealthArray[i] = scanner.nextDouble();
        }
        double maxWealth = wealthArray[0];
        int maxIndex = 0;

        for (int i = 1; i < numberOfInputs; i++) {
            if (wealthArray[i] > maxWealth) {
                maxWealth = wealthArray[i];
                maxIndex = i;
            }
        }

        System.out.println("Giá trị tài sản lớn nhất là: " + maxWealth + " tỉ USD");
        System.out.println("Tỷ phú có giá trị tài sản lớn nhất là tỷ phú thứ: " + (maxIndex + 1));
    }
}
