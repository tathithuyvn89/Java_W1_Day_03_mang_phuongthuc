package Java_W1_Day_03_mang_phuongthuc;

import java.util.Arrays;
import java.util.Scanner;

public class BT_chenthemphantuvaomangchotruoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i=0;i<7;i++){
            System.out.print("Nhap phan tu thu " + (i+1) + "vao mang: ");
            arr[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Nhap vao mot so x ma ban muon chen vao mang : ");
        int x = scanner.nextInt();
        int index=-1;
        do{
            System.out.print("Nhập vị trí muốn chèn vào mảng : ");
             index = scanner.nextInt();
             if(index<=1||index>=arr.length-1){
                 System.out.println("Không chèn được phần tử vào mảng");
             }
        } while (index<=1||index>=arr.length-1);
        System.out.println(index);
        for(int i=arr.length-1;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=x;
        System.out.println(Arrays.toString(arr));
    }
}
