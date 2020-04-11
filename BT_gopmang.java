package Java_W1_Day_03_mang_phuongthuc;

import java.util.Arrays;
import java.util.Scanner;

public class BT_gopmang {
    public static void main(String[] args) {
        int []arr1;
        int []arr2;
        int []arr3;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang 1 (duoi 10) : ");
        int numArr1= scanner.nextInt();
        arr1=new int[numArr1];
        for (int i=0; i<numArr1;i++){
            System.out.print("Nhap gia tri cua phan tu thu " +(i+1) + " vao trong mang 1 : ");
            arr1[i]=scanner.nextInt();
        }
        System.out.println("Mang 1 co cac ptu sau : "+ Arrays.toString(arr1));

        System.out.print("Nhap so luong phan tu cua mang 2 (duoi 10) : ");
        int numArr2= scanner.nextInt();
        arr2=new int[numArr2];
        for (int i=0; i<numArr2;i++){
            System.out.print("Nhap gia tri cua phan tu thu " +(i+1) + " vao trong mang 2 : ");
            arr2[i]=scanner.nextInt();
        }

        System.out.println("Mang 2 co cac ptu sau : "+ Arrays.toString(arr2));
        arr3 = new int[numArr1+numArr2];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        System.out.println("Mang 3 co cac ptu sau : "+ Arrays.toString(arr3));
        for (int j=arr1.length;j<arr3.length;j++){
            arr3[j] = arr2[j-(arr3.length-arr2.length)];
        }
        System.out.println("Mang 3 co cac ptu sau : "+ Arrays.toString(arr3));
    }
}
