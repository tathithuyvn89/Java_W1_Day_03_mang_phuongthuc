package Java_W1_Day_03_mang_phuongthuc;

import java.util.Arrays;
import java.util.Scanner;

/*
Bước 1: Khai báo mảng số nguyên với SIZE phần tử

Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím

Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất

Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mang

So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất.

Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất thì gán giá trị nhỏ nhất là phần tử tiếp theo.

Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất.
 */
public class BT_timgiatrinhonhatcua1mang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Xin hãy nhập size số phần tử mà bạn muốn tạo list : ");
        int size = scanner.nextInt();
        int []arr= new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.print("Nhâp giá trị của phần tử " +(i+1)+" là : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Bạn đã nhập vào mảng co gia tri nhu sau" + Arrays.toString(arr));
        //Tim gia tri nho nhat trong mang da nhap vao
        int minValue= arr[0];
        int minIndex =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<minValue){
                minValue = arr[i];
                minIndex=i;
            }
        }
        System.out.println("Gia tri phan tu nho nhat trong mang da nhap la " + minValue + " tai vi tri thu "+ (minIndex+1));
    }
}
