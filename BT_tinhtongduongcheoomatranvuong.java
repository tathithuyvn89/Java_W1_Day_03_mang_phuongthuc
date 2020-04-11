package Java_W1_Day_03_mang_phuongthuc;

import java.util.Scanner;

public class BT_tinhtongduongcheoomatranvuong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap vao do dai cua ma tran vuong: ");
        int m= scanner.nextInt();
        int [][]arr=new int[m][m];
        for (int row=0; row<arr.length;row++){
            for (int column=0;column<arr[row].length;column++){
                System.out.print("Nhap phan tu tai hang "+row + " cot "+column+ " la: ");
                arr[row][column]=scanner.nextInt();
            }
        }
        //Hien thi mang ma nguoi dung da nhap vao
        for (int row=0; row<arr.length;row++){
            for (int column=0;column<arr[row].length;column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("Tong duong cheo chinh cua ma tran la "+ sumOfDuongCheoChinh(arr));
    }
    public static int sumOfDuongCheoChinh(int[][]arr){
        int sum=0;
        for (int i =0; i<arr.length;i++){
            for (int j=0; j<arr[i].length;j++){
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}
