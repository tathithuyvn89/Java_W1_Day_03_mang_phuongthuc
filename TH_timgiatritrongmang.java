package Java_W1_Day_03_mang_phuongthuc;

import java.util.Scanner;

public class TH_timgiatritrongmang {
    public static void main(String[] args) {
        String[] students = {"Nam", "Hoa", "Ngoc", "Tung", "Giang", "Bich"};
        System.out.println(students.length);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao ten 1 ban sinh vien : ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vi tri cua sinh vien ten " + input_name + " trong danh sach la: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Khong ton tai ten " + input_name + " trong danh sach");
        }
    }
}
