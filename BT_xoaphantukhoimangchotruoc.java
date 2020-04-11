package Java_W1_Day_03_mang_phuongthuc;

import java.util.Arrays;
import java.util.Scanner;

public class BT_xoaphantukhoimangchotruoc {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 60, 45, 34, 43, 5, -9};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so x ma ban muon xoa khoi mang : ");
        int index_del = -1;
        int x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del >= 0) {
            System.out.println("gia tri can xoa nam o vi tri " + index_del);

            for (int i = index_del; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
            System.out.println(Arrays.toString(arr));
        } else {
            System.out.println("Không có giá trị cần xóa");
        }

    }
}
