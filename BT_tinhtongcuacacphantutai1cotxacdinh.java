package Java_W1_Day_03_mang_phuongthuc;

import java.util.Arrays;
import java.util.Scanner;
/*
Bước 1: tính tổng các phần tử của một mảng có sẵn

Dùng phương pháp khởi tạo nhanh để tạo ra một mảng có sẵn các phần tử. Viết mã để hỏi người dùng muốn tính tổng của cột mấy.
 Tổng của một cột là tổng các phần tử có vị trí j trong định vị [][i], sử dụng vòng lặp để tính tổng các phần tử này và trả về.

Thực thi chương trình để kiểm tra kết quả, thử với một số giá trị khác nhau để xác nhận rằng chương trình chạy đúng.

Bước 2: thu thập mảng thực từ nhập liệu của người dùng và hoàn thành yêu cầu

Viết mã để thay thế mảng được tạo nhanh bằng mảng được tạo ra từ nhập liệu của người dùng.
Trước tiên hỏi để biết kích thước các chiều của mảng, sau đó sử dụng vòng lặp để lần lượt hỏi từng giá trị của mảng.
 */
public class BT_tinhtongcuacacphantutai1cotxacdinh {
    public static int sumOfColum(int rows, int columns, int columnIndex) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[rows][columns];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print("Xin moi nhap vao gia tri cua phan tu tai hang " + row + " va cot " + column);
                arr[row][column] = scanner.nextInt();
            }
        }
        System.out.println("Duoi day mang 2 chieu ma ban da nhap vao");
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + "  ");
            }
            System.out.println();
        }
        // Tinh tong tai vi tri colum bat ky
        int total = 0;
        for (int row = 0; row < arr.length; row++) {
            total += arr[row][columnIndex];
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tao mang 2 chieu! Xin hay nhap so hang cua mang : ");
        int rows = scanner.nextInt();
        System.out.print("Tao mang 2 chieu! Xin hay nhap so cot cua mang : ");
        int columns = scanner.nextInt();
        System.out.print("Nhap vao cot ma ban muon tinh tong : ");
        int indexColumn = scanner.nextInt();
        System.out.println("Gia tri cua cot tai vi tri so " + indexColumn + " co tong la " + sumOfColum(rows, columns, indexColumn));
    }
}
