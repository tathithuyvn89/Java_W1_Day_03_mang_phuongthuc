package Java_W1_Day_03_mang_phuongthuc;

import java.util.Scanner;

public class TH_daocacphantutrongmang {
//    public static void main(String[] args) {
//        System.out.println("The application reverses the element of the array");
//        int size;
//        int []arr;
//        Scanner scanner= new Scanner(System.in);
//        do{
//            System.out.print("Enter a size : ");
//            size=scanner.nextInt();
//            if (size>20){
//                System.out.println("Size does not exceed 20");
//            }
//        } while (size>20);
//        arr=new int[size];
//        int i=0;
//        while (i<arr.length){
//            System.out.print("Enter element " + (i+1)+ " : ");
//            arr[i]=scanner.nextInt();
//            i++;
//        }
//        System.out.printf("%-20s%s","Elements in array  ",":");
//        for (int j=0;j<arr.length;j++){
//            System.out.print(arr[j]+"\t");
//        }
//        //array reverse
//        for (int j=0; j<arr.length/2;j++){
//            int temp=arr[j];
//            arr[j]=arr[size-1-j];
//            arr[size-1-j]=temp;
//        }
//        System.out.println();
//        System.out.printf("%-20s%s","Reverse array ",":");
//        for (int j=0;j<arr.length;j++){
//            System.out.print(arr[j]+"\t");
//        }
//    }
public static void main(String[] args) {
    int[] arr;
    int size;
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.print("Nhap vao do dai cua mang : ");
        size = scanner.nextInt();
        if (size > 20) {
            System.out.println("Xin hay nhap lai so nho hon 20");
        }
    } while (size > 20);
    arr = new int[size];
    // Tao 1 mang co do dai bang do dai da nhap vao ben tren
    for (int i = 0; i < size; i++) {
        System.out.print("Nhap vao gia tri thu " + (i + 1) + " cua mang : ");
        arr[i] = scanner.nextInt();
    }
    // in ra mang chua duoc sap xep
    System.out.printf("%-20s%s", "Mang chua duoc sap", ":");
    for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + "\t");
    }
    //Sap sep thu tu cua mang

    for (int i = 0; i < size / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[size - 1 - i];
        arr[size - 1 - i] = temp;
    }
    System.out.println();
    System.out.printf("%-20s%s", "Mang da daoc vi tri", ":");
    for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + "\t");
    }

}
}