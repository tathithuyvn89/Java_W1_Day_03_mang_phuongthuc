package Java_W1_Day_03_mang_phuongthuc;

import java.util.Scanner;

public class BT_tinhtongcacphantutai1cotxacdinh {
    public static void main(String[] args) {
        int [][] arr;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so hang vao mang : ");
        int rows = scanner.nextInt();
        System.out.print("Nhap so cot vao mang : ");
        int columns = scanner.nextInt();
        arr = new int[rows][columns];
        for (int row = 0; row<arr.length;row++){
            for (int column=0; column<arr[row].length;column++){
                System.out.print("Nhap gia tri tai vi tri hang " + row+ " cot "+ column+ " la : ");
                arr[row][column]=scanner.nextInt();
            }
        }
        System.out.println("Duoi day mang 2 chieu ma ban da nhap vao");
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + "  ");
            }
            System.out.println();
        }
        System.out.print("Nhap cot ma ban muon tinh tong : ");
        int indexColumn = scanner.nextInt();
        System.out.println("tong gia tri la "+sumOfColum(arr,indexColumn));

    }
    public static int sumOfColum(int[][]arr,int indexColumn){
        int total=0;
        for (int i=0; i<arr.length;i++){
            total+=arr[i][indexColumn];
        }
        return total;
    }
}
