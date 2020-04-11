package Java_W1_Day_03_mang_phuongthuc;

import java.util.Scanner;

public class BT_demsoluongsinhviendo {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("So luong sinh vien khong duoc vuot qua 30 nguoi ");
            }
        } while(size>30);
        //Nhap gia tri cua tung phan tu trong mang
        arr=new int[size];
        for (int i=0; i<arr.length;i++){
            System.out.print("Nhap so diem cua sinh vien thu "+i+ " la: ");
            arr[i]=scanner.nextInt();
        }
        //Su dung vong lap for de in ra danh sach diem vua nhap dong thoi dem so luong sinh vien do
        int count=0;
        System.out.print("Danh sach diem da duoc nhap vao nhu sau : ");
        for (int j=0; j<arr.length;j++){
            System.out.print(arr[j]+"\t");
            if (arr[j]>=5&&arr[j]<=10){
                count++;
            }
        }
        System.out.println("\n So luong sinh vien thi do la " +count);

    }

}
