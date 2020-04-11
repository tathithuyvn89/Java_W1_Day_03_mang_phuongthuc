package Java_W1_Day_03_mang_phuongthuc;

import java.util.Arrays;
import java.util.Scanner;

public class BT_timgiatrilonnhattrongmang2chieu {
    public static void findMax(int m, int n) {
        String result ="";
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[m][n];
        for (int row = 0; row <arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                System.out.print("Nhap vao phan tu tai hang " + row + " tai cot " + colum+ "la : ");
                arr[row][colum] = scanner.nextInt();
            }
        }
        int maxValue = arr[0][0];
        int maxIndexRow = 0;
        int maxIndexColum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int colum = 0; colum < arr[row].length; colum++) {
                if (arr[row][colum] > maxValue) {
                    maxValue = arr[row][colum];
                    maxIndexColum = colum;
                    maxIndexRow = row;
                }
            }
        }
        System.out.println("Gia tri lon nhat cua mang la " + maxValue+" tai cot thu "+ maxIndexColum+ " hang thu "+maxIndexRow);
    }
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap mang 2 chieu co so hang x la : ");
        int x = scanner.nextInt();
        System.out.print("Nhap mang 2 chieu co so cot y la : ");
        int y = scanner.nextInt();
         findMax(x,y);
    }
}
