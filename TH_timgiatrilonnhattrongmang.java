package Java_W1_Day_03_mang_phuongthuc;

import java.util.Scanner;

public class TH_timgiatrilonnhattrongmang {
    public static void main(String[] args) {
        int size;
        int []arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size=scanner.nextInt();
            if (size>20){
                System.out.println("Size should not exceed 20");
            }
        } while (size>20);
        arr= new int[size];
        int i=0;
        while (i<arr.length){
            System.out.print("Enter element "+(i+1)+ " : ");
            arr[i]=scanner.nextInt();
            i++;
        }
        //In ra danh sach da nhap
        System.out.print("Property list: ");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
        //Tim ra gia tri lon nhat trong mang da nhap
        int max=arr[0];
        int index=0;
        for (int j=0;j<arr.length;j++){
            if (arr[j]>max){
                max=arr[j];
                index=j+1;
            }
        }
        System.out.println("\n"+ "The largest property value in the list is " + max + ", at position " + index);
    }
}
